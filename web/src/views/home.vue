<template>
  <!-- <div class="nav">
    <div class="image-container">
      <img src="../assets/img/bili_navbar.jpg" alt="background-image" class="background-image" />
       <div class="search-container">
        <form @submit.prevent="search">
          <input type="text" class="search-box" id="search-input" placeholder="想要成为影之实力者" />
        </form>
       </div>
       <div class="user-container">
          <router-link class="user-space" to="/userspace">
            <img src="https://static.hdslb.com/images/akari.jpg" class="user-image" alt="">
          </router-link>
          <router-link class="user-login" to="/login">登录</router-link>
       </div>
    </div> 
  </div> -->
  <Navbar></Navbar>
  <h1>欢迎光临！</h1>
    <div class="tag-container">
      <a class="tag" href="https://www.bilibili.com/anime/" style="letter-spacing: 2px;" target="_blank">番剧</a>
      <a class="tag" href="#" style="letter-spacing: 2px;" target="_blank">游戏</a>
      <a class="tag" href="#" style="letter-spacing: 2px;" target="_blank">娱乐</a>
      <a class="tag" href="#" style="letter-spacing: 2px;" target="_blank">影视</a>
      <a class="tag" href="#" style="letter-spacing: 2px;" target="_blank">音乐</a>
      <a class="tag" href="#" style="letter-spacing: 2px;" target="_blank">舞蹈</a>
      <a class="tag" href="#" style="letter-spacing: 2px;" target="_blank">生活</a>
      <a class="tag" href="#" style="letter-spacing: 2px;" target="_blank">鬼畜</a>
      <a class="tag" href="#" style="letter-spacing: 2px;" target="_blank">科技</a>
      <a class="tag" href="#" style="letter-spacing: 2px;" target="_blank">纪录片</a>
    </div>
</template>

<script>
import Navbar from '@/components/Navbar.vue';
import axios from "axios";

export default {
  components: {
    Navbar
  }
}
</script>

<style>
.tag-container {
  display: flex;  /* 使用弹性布局，使标签在一行展示 */
  flex-wrap: wrap;  /* 如果标签过多，自动换行 */
  gap: 10px;  /* 标签之间的间距 */
  padding: 10px;  /* 容器的内边距 */
}

.tag {
  background-color: #f6f6f6;  /* 背景颜色 */
  padding: 8px 12px;  /* 内边距, 使标签看起来更大 */
  border-radius: 8px;  /* 圆角效果 */
  font-size: 14px;  /* 字体大小 */
  color: #333;  /* 文字颜色 */
  cursor: pointer;  /* 鼠标悬停时显示为可点击 */
  text-decoration: none;  /* 去掉下划线 */

  /* 添加阴影效果 */
  box-shadow: 0 1px 3px rgba(0, 0, 0, 0.1);
  transition: background-color 0.3s, box-shadow 0.3s;  /* 过渡效果 */
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
  top: 24px;
  right: 390px;
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