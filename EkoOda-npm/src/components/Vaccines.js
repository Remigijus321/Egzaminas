import React,{useContext, useState, useEffect} from 'react'
import {DataContext} from './DataProvider'
import {Link} from 'react-router-dom'
import ProductService from './services/ProductService'
import axios from 'axios'

export default function Cart() {
    const value = useContext(DataContext)
    const [vaccines, setVaccines] = value.vaccines;

    useEffect(() => {
        axios.get('http://localhost:8080/EkoOda-war-0.0.1-SNAPSHOT/api/vaccines').then(response => setVaccines(response.data))
    }, [setVaccines])

    return (
        <>
           {
               vaccines.map(product =>(
                   <div className="details cart" key={product.id}>
                       <div className="box-details">
                           <h2 title={product.productTitle}>{product.name}</h2>
                           <h3 style ={{marginTop: "10px"}}>{product.desctiption}</h3>
                           <p>Quantity: {product.quantity}</p>
                       </div>

                   </div>
               ))
           }
        </>
    )
}
