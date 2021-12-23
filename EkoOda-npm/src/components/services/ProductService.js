import axios from 'axios';

class ProductService {

    getCenters() {
        return axios.get('http://localhost:8080/EkoOda-war-0.0.1-SNAPSHOT/api/centers');
    }

    addCenter(center) {
        return axios.post('http://localhost:8080/EkoOda-war-0.0.1-SNAPSHOT/api/centers', center)
    }

    getVaccines() {
        return axios.get('http://localhost:8080/EkoOda-war-0.0.1-SNAPSHOT/api/vaccines');
    }

    removeItemFromCart(product) {
        return axios.delete(`http://localhost:8080/hello-world-calc-0.0.1-SNAPSHOT/api/cart/${product.productId}`, product)
    }
}

export default new ProductService();