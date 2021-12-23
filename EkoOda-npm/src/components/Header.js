import React, {useState, useContext} from 'react'
import Menu from './svg/bars-solid.svg'
import Close from './svg/times-solid.svg'
import Cart from './svg/cart.svg'
import {Link} from 'react-router-dom'
import {DataContext} from './DataProvider'
import ProductService from './services/ProductService'

export default function Header() {
    const [menu, setMenu] = useState(false)
    const value = useContext(DataContext)

    const toggleMenu = () =>{
        setMenu(!menu)
    }

    const styleMenu = {
        left: menu ? 0 : "-100%"
    }

    return (
        <header>
            <div className="menu" onClick={toggleMenu}>
                <img src={Menu} alt="" width="30" />
            </div>

            <ul style={styleMenu}>
                <li><Link to="/centers">Vakcinacijos centrai</Link></li>
                <li><Link to="/vaccines">Vakcinos</Link></li>
                <li><Link to="/">About</Link></li>
                <li onClick={toggleMenu}>
                    <img src={Close} alt="" width="30" className="menu" />
                </li>
            </ul>
      </header>
    )
}
