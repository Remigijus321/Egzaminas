import React, {createContext, useState, useEffect} from 'react'
import ProductService from './services/ProductService';

export const DataContext = createContext();

export const DataProvider = (props) => {
    const [centers, setCenters] = useState([]);

    useEffect(() => {
        ProductService.getCenters().then((response) => {
        setCenters(response.data)
        })
    }, [setCenters])

    const [vaccines, setVaccines] = useState([])

    useEffect(() => {
        localStorage.setItem('dataCart', JSON.stringify(vaccines))
    },[setVaccines])


    const value = {
        centers: [centers, setCenters],
        vaccines: [vaccines, setVaccines],
    }

    return (
        <DataContext.Provider value={value}>
            {props.children}
        </DataContext.Provider>
    )
}
