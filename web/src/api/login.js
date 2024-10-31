import axios from 'axios'
import login from '../utils/request'

const loginApi = data => {
    return axios.post(
        'http://localhost:8081/api/login',
        data)
    }

const registerApi = data => {
    return axios.post(
        'http://localhost:8081/api/register',
        data)
}

export default {
    loginApi,
    registerApi
}