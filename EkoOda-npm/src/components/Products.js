import React, {useContext} from 'react'
import {DataContext} from './DataProvider'
import {Link} from 'react-router-dom'
import ProductService from './services/ProductService'

export default function Products() {
    const value = useContext(DataContext)
    const [centers] = value.centers

    return (
        <div className="products">
            {
                centers.map(center =>(
                    <div className="card" key={center.id}>
                        <Link to={`/products/${center.id}`}>
                            <img src={center.imageLink} alt=""/>
                        </Link>
                        <div className="box">
                        <h3 title={center.name}>
                            <Link to={`/products/${center.id}`}>{center.name}</Link>
                        </h3>
                        <p>{center.description}</p>
                        <h4>{center.address}</h4>

                        <Link to="/registracija" className="cart">
                               Registruotis vakcinai
                            </Link>
                        </div>
                    </div>
                ))
            }
          
          
        </div>
    )
}
