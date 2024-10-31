<template>
     <Navbar></Navbar>
    <div class="userspace-container">
        <div class="userspace-bg">
            <img src="../assets/img/bili_bg.jpg" class="space-bg" alt="">
            <div class="user-info">
                <div class="user-avatar-container">
                    <img class="user-avatar-img" src="https://static.hdslb.com/images/akari.jpg" alt="" @click="Uploadavatar">
                    <div class="user-basic">
                    <div>
                        <span id="user-name">想蛇在薇塔的脚上</span>
                    </div>
                    <div class="user-signature">
                        <input type="text" id="user-sign" maxlength="60" class="space-input" placeholder="编辑个性签名">
                    </div>
                    </div>
                </div>
            </div>
        </div>
    </div>    
</template>
<script>
import router from '@/router';
import Uploadavatar from './uploadavatar.vue';
import Navbar from '@/components/Navbar.vue';
export default {
    methods: {
        Uploadavatar() {
            console.log('uploadavatar');
            router.push({
                name: 'uploadavatar'
            });
        }
    },
    components: {
        Navbar
    }
}
</script>
<style>
* {
  margin: 0;
  padding: 0;
}
.userspace-bg {
    position: relative;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100%;
}
.space-bg{
    display: flex;
    
    justify-content: center;
}
.user-avatar-container {
    position: absolute;
    top: 20%;
    left: 50%;
    transform: translateX(-50%);
}
.user-avatar-img {
  position: absolute;
  top: 60px;
  right: 500px;
  transition: all 0.5s ease;
  width: 80px;
  height: 80px;
  border-radius: 50%;
  cursor: pointer;
}
.user-info {
    display: flex;
    align-items: right;
}
.user-basic {
    margin-left: 20px;
    position: absolute;
    top: 70px;
    right: 300px;
}
.user-avatar-img {
    width: 80px;
    height: 80px;
    border-radius: 50%;
    cursor: pointer;
}

.space-input {
    line-height: 26px;
    height: 26px;
    background-color: transparent;
    color: hsla(0, 0%, 100%, .8);
}

.user-signature {
    margin-top: 10px; /* 如果需要调整签名与名字之间的距离 */
}

</style>