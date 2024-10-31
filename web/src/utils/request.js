import axios from "axios";

const request=axios.create({
    // 注意！！ 这里是全局统一加上了 '/api' 前缀，也就是说所有接口都会加上'/api'前缀在，
    // 页面里面写接口的时候就不要加 '/api'了，否则会出现2个'/api'，类似 '/api/api/user'这样的报错，切记！！！
    baseURL:'http://localhost:8081/api',
    timeout:5000
});
// request 拦截器
// 这个拦截器可以在请求发送前对请求进行处理
// 比如：可以在请求中统一添加token，或对请求参数进行统一加密等
request.interceptors.request.use(config => {
    // 设置请求头，指定请求内容类型为JSON
    config.headers['Content-Type'] = 'application/json;charset=utf-8';
    return config
},error => {
    return Promise.reject(error)
});

// response 拦截器
// 这个拦截器可以在接口响应后对结果进行统一处理
request.interceptors.response.use(
    response => {
        // 获取响应数据
        let res = response.data;

        // 兼容处理服务端返回的字符串数据，将其解析为JSON对象
        if (typeof res === 'string') {
            res = res ? JSON.parse(res) : res;
        }

        // 检查响应中的状态码，如果为401则表示未授权
        if(res.code === '401'){
            // 如果未授权，则重定向到登录页面
            router.push('/login');
        }

        // 返回处理后的响应数据
        return res;
    },
    error => {
        // 如果响应发生错误，打印错误信息以便调试
        console.error('response error: ' + error);
        // 返回Promise.reject以通知响应发生错误
        return Promise.reject(error);
    }
)

// 导出配置好的axios实例，以便在其他模块中使用
export default request;
