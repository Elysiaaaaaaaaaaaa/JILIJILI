<template>
  <div class="nav">

      <div class="mini-header-content">
        <div class="nav-link">
          <ul class="nav-link-ul">
            <li class="nav-link-item">
              <!-- <img class="nav-link-item-img" src="../assets/navigationicon/logo.png" alt="" /> -->
              <svg width="18" height="18" style="margin-right: 6px;color: #fff;" viewBox="0 0 18 10" fill="none"
                xmlns="http://www.w3.org/2000/svg" class="zhuzhan-icon">
                <path fill-rule="evenodd" clip-rule="evenodd"
                  d="M3.73252 2.67094C3.33229 2.28484 3.33229 1.64373 3.73252 1.25764C4.11291 0.890684 4.71552 0.890684 5.09591 1.25764L7.21723 3.30403C7.27749 3.36218 7.32869 3.4261 7.37081 3.49407H10.5789C10.6211 3.4261 10.6723 3.36218 10.7325 3.30403L12.8538 1.25764C13.2342 0.890684 13.8368 0.890684 14.2172 1.25764C14.6175 1.64373 14.6175 2.28484 14.2172 2.67094L13.364 3.49407H14C16.2091 3.49407 18 5.28493 18 7.49407V12.9996C18 15.2087 16.2091 16.9996 14 16.9996H4C1.79086 16.9996 0 15.2087 0 12.9996V7.49406C0 5.28492 1.79086 3.49407 4 3.49407H4.58579L3.73252 2.67094ZM4 5.42343C2.89543 5.42343 2 6.31886 2 7.42343V13.0702C2 14.1748 2.89543 15.0702 4 15.0702H14C15.1046 15.0702 16 14.1748 16 13.0702V7.42343C16 6.31886 15.1046 5.42343 14 5.42343H4ZM5 9.31747C5 8.76519 5.44772 8.31747 6 8.31747C6.55228 8.31747 7 8.76519 7 9.31747V10.2115C7 10.7638 6.55228 11.2115 6 11.2115C5.44772 11.2115 5 10.7638 5 10.2115V9.31747ZM12 8.31747C11.4477 8.31747 11 8.76519 11 9.31747V10.2115C11 10.7638 11.4477 11.2115 12 11.2115C12.5523 11.2115 13 10.7638 13 10.2115V9.31747C13 8.76519 12.5523 8.31747 12 8.31747Z"
                  fill="currentColor"></path>
              </svg>
              <router-link to="/">首页</router-link>
            </li>
            <li class="nav-link-item">
              <a href="#">番剧</a>
            </li>
            <li class="nav-link-item">
              <a href="#">游戏中心</a>
            </li>
            <li class="nav-link-item">
              <a href="#">直播</a>
            </li>
            <li class="nav-link-item">
              <a href="#">会员购</a>
            </li>
            <li class="nav-link-item">
              <a href="#">漫画</a>
            </li>
            <li class="nav-link-item">
              <a href="#">赛事</a>
            </li>
            <li class="nav-link-item">
              <a href="#">S10</a>
            </li>
            <li class="nav-link-item">
              <span>
                <div>
                  <svg width="16" height="16" viewBox="0 0 16 10" fill="none" xmlns="http://www.w3.org/2000/svg"
                    class="download-client-trigger__icon">
                    <path
                      d="M7.23181 8.65895V1.75796C7.23181 1.33935 7.57582 1 8.00018 1C8.42453 1 8.76854 1.33935 8.76854 1.75796V8.67097L9.98589 7.47009C10.286 7.17409 10.7725 7.17409 11.0725 7.47009C11.3726 7.7661 11.3726 8.24601 11.0725 8.54201L8.54958 11.0308C8.24952 11.3268 7.76302 11.3268 7.46295 11.0308L4.94002 8.54201C4.63995 8.24601 4.63995 7.7661 4.94002 7.47009C5.24008 7.17409 5.72658 7.17409 6.02665 7.47009L7.23181 8.65895Z"
                      fill="currentColor"></path>
                    <path
                      d="M3.48023 4.29936C2.40686 4.29936 1.53672 5.15772 1.53672 6.21656V11.5669C1.53672 12.6257 2.40686 13.4841 3.48023 13.4841H12.5198C13.5931 13.4841 14.4633 12.6257 14.4633 11.5669V6.21656C14.4633 5.15772 13.5931 4.29936 12.5198 4.29936H11.6158C11.1915 4.29936 10.8475 3.96001 10.8475 3.5414C10.8475 3.12279 11.1915 2.78344 11.6158 2.78344H12.5198C14.4418 2.78344 16 4.3205 16 6.21656V11.5669C16 13.4629 14.4418 15 12.5198 15H3.48023C1.55815 15 0 13.4629 0 11.5669V6.21656C0 4.3205 1.55815 2.78344 3.48023 2.78344H4.38418C4.80853 2.78344 5.15254 3.12279 5.15254 3.5414C5.15254 3.96001 4.80853 4.29936 4.38418 4.29936H3.48023Z"
                      fill="currentColor"></path>
                  </svg>
                  下载APP
                </div>
              </span>
            </li>
          </ul>
        </div>
        <div class="nav-search-box">
          <div class="nav-search">
            <form id="nav-searchform">
              <input class="search-input" type="text" placeholder="想要成为影之实力者" v-model="searchInput" />
              <div class="nav-search-btn">
                <el-button class="ebtn" icon="el-icon-search" size="medium" style="" @click="search()"></el-button>
              </div>
            </form>
          </div>
        </div>
        <div class="nav-user-center">
          <div class="user-con">
            <div class="item">
              <span>
                <div v-if="this.user === null || this.user.username == undefined">
                  <img class="user-img" src="https://static.hdslb.com/images/akari.jpg" style="float: left;" alt="" />
                  <router-link to="/login" class="user-login">登录</router-link>
                  <!-- <div class="item">
                    <span><a class="user-login" href="/register" style="float: left;padding-left: 5px;">注册</a></span>
                  </div> -->
                </div>
                <div v-else>

                  <span class="el-dropdown-link">
                    <img class="user-img" src="https://static.hdslb.com/images/akari.jpg" alt="" />
                    {{ this.user.username }}
                    <el-button type="danger" style="width: 80px;height: 36px;" class="exit"
                      @click="exit()">退出登录</el-button>
                  </span>

                  <el-dropdown>
                    <span class="el-dropdown-link">
                      <img class="user-img" src="../assets/img/favorite.png" alt="" /><span
                        style="color: #fff;">收藏</span>
                    </span>

                    <el-dropdown-menu slot="dropdown" style="z-index: 9999;width: 300px;">
                      <div v-for="item in favorities" :key="item.todo">
                        <el-dropdown-item>
                          <el-card :body-style="{ padding: '0px' }" class="picCard">
                            <img :src="getCoverUrl(item.md5)" class="image" @click="openMedia(item)"
                              style="cursor: pointer;width: 120px;height: 70px;">
                            <span style="position:absolute" @click="openMedia(item)">{{ item.title }}</span>
                          </el-card>
                        </el-dropdown-item>
                      </div>


                    </el-dropdown-menu>
                  </el-dropdown>

                </div>
              </span>
            </div>

            <div>
              <span class="upload" style="border-radius: 5px;">
                 <router-link to="/upload">投稿</router-link>
              </span>
            </div>
          </div>
        </div>
      </div>
      <div class="bili-banner">
        <div class="layer">
          <div class="b-logo">
            <a href="https://www.bilibili.com/">
              <img class="logo-img" src="../assets/img/logo.png" alt="" />
            </a>
          </div>
        </div>
      </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  data() {
    return {
      user: {},
      favorities: [],
      access_token: '',
      refresh_token: '',
      searchInput: '',
    }
  },
  methods: {
    errorCatch(error) {
      console.log(error)
      let message = '未知异常'
      if (error.response.status) {
        switch (error.response.status) {
          case 400: message = '请求错误';
            break;
          case 401: message = '未授权，请登录';
            break;
          case 403: message = '权限不足';
            break;
          case 404: message = '请求出错';
            break;
          case 408: message = '请求超时';
            break;
          case 500: message = '服务器错误';
            break;
          case 501: message = '服务未实现';
            break;
          case 502: message = '网络错误';
            break;
          case 503: message = '服务不可用';
            break;
          case 504: message = '网络超时';
            break;
          case 505: message = 'HTTP版本不受支持';
            break;
        }
        this.$message({
          type: "error",
          message: message
        })
      }
    },
    search() {
      if (this.searchInput != null && this.searchInput != '' && this.searchInput != undefined) {
        window.open(`http://localhost:8080/all?searchContext=${this.searchInput}`)
      }
    },
    openMedia(row) {
      window.open(`http://localhost:8080/video/${row.mediaId}`)
    },
    exit() {
      localStorage.removeItem('access_token')
      localStorage.removeItem('refresh_token')
      this.user = null
    },
    getCoverUrl(md5) {
      const c1 = md5['0']
      const c2 = md5['1']
      const url = `${process.env.VUE_APP_SERVER_STATIC_RESOURCE}` + '/video/' + c1 + '/' + c2 + '/' + md5 + '/' + md5 + '.jpg'
      return url
    },
    userInit() {
      this.access_token = localStorage.getItem('access_token')
      this.refresh_token = localStorage.getItem('refresh_token')
      if (this.access_token === null || this.access_token === "" || this.access_token === undefined) {
        return
      }

      const formData = new FormData()
      formData.append('token', this.access_token)
      axios.post(`${process.env.VUE_APP_SERVER_GATEWAY}` + '/oauth/check_token', formData).then(response => {
        this.user = JSON.parse(response.data.user_name)
      }).catch(error => {
        this.errorCatch(error)
      })
    },
    getFavorite() {
      if (this.access_token === '' || this.access_token === null || this.access_token === undefined) {
        return
      }
      axios.get(`${process.env.VUE_APP_SERVER_GATEWAY}` + `/favorite/listFavorite`,
        {
          headers: {
            authorization: `Bearer ${this.access_token}`,
          }
        }
      ).then(response => {
        if (response.data.code === 1) {
          this.favorities = response.data.data
        }
      }).catch(error => {
        // this.errorCatch(error)
        console.log(error)
      })
    },
    async refreshToken() {
      this.access_token = localStorage.getItem('access_token')
      if (this.access_token === '' || this.access_token === null || this.access_token === undefined) {
        return
      }
      this.refresh_token = localStorage.getItem('refresh_token')
      const refreshData = new FormData()
      refreshData.append('grant_type', 'refresh_token')
      refreshData.append('client_id', 'Graduation')
      refreshData.append('client_secret', 'Graduation')
      refreshData.append('refresh_token', this.refresh_token)
      axios.post(`${process.env.VUE_APP_SERVER_GATEWAY}` + `/oauth/token`, refreshData).then(response => {
        localStorage.setItem('access_token', response.data.access_token)
        localStorage.setItem('refresh_token', response.data.refresh_token)
      }).catch(error => {
        this.errorCatch(error)
      })
    }
  },
  created() {
    this.refreshToken()
    this.userInit()
    this.getFavorite()
  },

  mounted() {
  }
}
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

a,
ul,
li {
  margin: 5px;
  list-style: none;
  text-decoration: none;
  color: #ffffff;
}

button,
input {
  padding: 10px;
  text-decoration: none;
  border: none;
}

input:hover {
  text-decoration: none;
}

input,
button:focus {
  text-decoration: none;
  outline: none;
  border: none;
}

.nav {
  position: relative;
  height: 150px;
  margin: 0;
  padding: 0;
}

.mini-header-content {
  color: #ffffff;
  box-sizing: border-box;
  padding: 10px 24px;
  line-height: 30px;
  position: relative;
  margin: 0 auto;
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  z-index: 100;
}

.nav-link .nav-link-ul {
  height: 36px;
  display: flex;
  align-items: center;
  font-size: 14px;
}

.nav-link .nav-link-ul .nav-link-item {
  margin-right: 12px;
  margin: 0;
  padding: 0;
}

.nav-link-item-img {
  width: 18px;
  height: 18px;
  vertical-align: middle;
}

/* 导航搜索 */
.nav-search-box {
  margin: 10px 10px;
  width: 500px;
  transition: width 0.3s;
}

.nav-search {
  position: relative;
}

.nav-search #nav-searchform {
  display: block;
  padding: 0 38px 0 16px;
  border: 1px solid hsla(0, 0%, 100%, 0);
  border-radius: 2px;
  background-color: #fff;
}

.search-input {
  width: 431px;
  height: 32px;
}

.nav-search .nav-search-keyword {
  overflow: hidden;
  width: 100%;
  height: 34px;
  border: none;
  background-color: transparent;
  box-shadow: none;
  color: #999;
  font-size: 14px;
  line-height: 34px;
  transition: all 0.2s;
}

.nav-search .nav-search-btn {
  position: absolute;
  top: 0;
  right: 0;
  margin: 0;
  padding: 0;
  width: 48px;
  height: 35px;
  border: none;
  border-radius: 2px;
  /* background: #e7e7e7; */
  line-height: 35px;
}

.nav-search-btn-img {
  width: 16px;
  height: 16px;
  padding: 8px 16px;
}

/* 用户中心页面 */
.nav-user-center {
  font-size: 14px;
  display: flex;
  flex-shrink: 0;
}

.nav-user-center .user-con {
  display: flex;
  align-items: center;
}

.nav-user-center .user-con .item {
  position: relative;
  display: flex;
  margin-left: 0px;
  cursor: pointer;
}

.user-img {
  width: 32px;
  height: 32px;
  border-radius: 20px;
  vertical-align: middle;
}

.user-login {
  line-height: 32px;
  vertical-align: middle;
}

.upload {
  position: relative;
  color: #fff;
  font-size: 14px;
  display: block;
  width: 100px;
  height: 36px;
  line-height: 36px;
  text-align: center;
  background: #fb7299;
  border-radius: 2px;
  margin-left: 14px;
}




/* 背景图 */
.layer {
  width: 100%;
  height: 140px;
  background-image: url('../assets/img/bili_navbar.jpg');
}

.bili-banner {
  position: relative;
  margin-top: 0;
  top: -56px;
}

/* logo */
.logo-img {
  position: relative;
  top: 50px;
  left: 60px;
  height: 90px;
}
</style>