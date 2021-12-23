import React from 'react';
import Header from './components/Header'
import Products from './components/Products'
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom'
import {DataProvider} from './components/DataProvider'
import Vaccines from './components/Vaccines'


function App() {

  return (
    <DataProvider>
      <div className="App">
        <Router basename={process.env.PUBLIC_URL}>
          <Header />
          <section>
            <Routes>
              <Route path="centers" element={ <Products /> } />
              <Route path="vaccines" element={ <Vaccines /> } />
            </Routes>
          </section>
        </Router>
      </div>
    </DataProvider>
  );
}

export default App;
