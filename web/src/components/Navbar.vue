<template>
    <div class="nav">
        <div class="image-container">
            <div class="nav-link">
                <router-link to="/" class="nav-item">首页</router-link>
                <router-link to="anime" class="nav-item">番剧</router-link>
                <router-link to="game" class="nav-item">游戏中心</router-link>
            </div>
            <img src="../assets/img/bili_navbar.jpg" alt="background-image" class="background-image" />
            <div class="search-container">
                <form @submit.prevent="search">
                    <input type="text" class="search-box" id="search-input" placeholder="想要成为影之实力者" />
                </form>
            </div>
            <div class="user-container">
                <router-link class="user-space" to="/userspace">
                    <img src="../assets/img/Pasika.png" class="user-image" alt="">
                </router-link>
                <router-link class="user-login" to="/login">登录</router-link>
                <router-link class="submit" to ="/submit">投稿</router-link>
            </div>
        </div> 
    </div>
</template>
<script>
export default {
    
}
</script>
<style>
.nav-link {
    position: absolute;
    left: 0;
    top: 13px;
    padding: 15px 20px;
    width: 100%;
    display: flex;
    justify-self: start;
}
.nav-item {
    margin-right: 20px;
    color: #333;
}

.image-container {
  position: relative;
  width: 100%;
  margin: 0 auto;
  overflow: hidden; /* 确保子元素不溢出 */
}

.background-image {
  width: 100%;
  height: auto;
  object-fit: cover; /* 保持纵横比 */
  display: block;
}

.search-box {
  position: absolute;
  bottom: 80px; /* 从底部向上定位 */
  left: 50%; /* 从水平中心定位 */
  transform: translateX(-50%); /* 使其精确居中 */
  padding: 10px;
  width: 80%; /* 搜索框宽度 */
  max-width: 400px; /* 搜索框最大宽度 */
  border: 1px solid #ccc;
  border-radius: 5px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
}

.search-container {
  position: relative;
}

.user-image {
  position: absolute;
  top: 12px;
  right: 430px;
  transition: all 0.5s ease;
  width: 50px;
  height: 50px;
  border-radius: 50%;
  object-fit: cover;
}

.user-login {
  position: absolute;
  top: 20px;
}

.submit {
    border: 1px  #ccc;
    border-radius: 5px;
    padding: 10px 20px;
    background: #fb7299;
    position: absolute;
    top: 16px;
    right: 290px;
}

a{
  list-style: none;
  text-decoration: none;
  color: #ffffff;
}
.user-container {
  display: flex;
  align-items: center;
}
</style>
