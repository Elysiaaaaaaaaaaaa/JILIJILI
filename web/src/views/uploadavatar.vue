<template>
  <div class="upload-container">
    <el-upload
        class="upload-demo"
        drag
        action="https://jsonplaceholder.typicode.com/posts/"
        multiple>
      <i class="el-icon-upload"></i>
      <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
      <div class="el-upload__tip" slot="tip">只能上传jpg/png文件，且不超过500kb</div>
    </el-upload>
  </div>
</template>


<style>
.upload-container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh; /* 使容器高度等于视口高度，以便垂直居中 */
}

.upload-demo {
  position: relative;
  width: 800px; /* 设置宽度 */
  height: 600px; /* 设置高度 */
  flex-direction: column;
  align-items: center;
  justify-content: center;
  padding: 20px;
  box-sizing: border-box; /* 确保内边距和边框不影响元素的总宽度和高度 */
}

.avatar-uploader .el-upload:hover {
  border-color: #409EFF;
}

.avatar-uploader-icon {
  font-size: 28px;
  color: #8c939d;
  width: 178px;
  height: 178px;
  line-height: 178px;
  text-align: center;
}

.avatar {
  width: 178px;
  height: 178px;
  display: block;
}
</style>

<script>
export default {
  data() {
    return {
      imageUrl: ''
    };
  },
  methods: {
    handleAvatarSuccess(res, file) {
      this.imageUrl = URL.createObjectURL(file.raw);
    },
    beforeAvatarUpload(file) {
      const isJPG = file.type === 'image/jpeg';
      const isLt2M = file.size / 1024 / 1024 < 2;

      if (!isJPG) {
        this.$message.error('上传头像图片只能是 JPG 格式!');
      }
      if (!isLt2M) {
        this.$message.error('上传头像图片大小不能超过 2MB!');
      }
      return isJPG && isLt2M;
    }
  }
}
</script>


<!--<style>-->
<!--  .avatar-uploader .el-upload {-->
<!--    border: 1px dashed #d9d9d9;-->
<!--    border-radius: 6px;-->
<!--    cursor: pointer;-->
<!--    position: relative;-->
<!--    overflow: hidden;-->
<!--  }-->
<!--  .avatar-uploader .el-upload:hover {-->
<!--    border-color: #409EFF;-->
<!--  }-->
<!--  .avatar-uploader-icon {-->
<!--    font-size: 40px;-->
<!--    color: #8c939d;-->
<!--    width: 178px;-->
<!--    height: 178px;-->
<!--    line-height: 178px;-->
<!--    text-align: center;-->
<!--  }-->
<!--  .avatar {-->
<!--    width: 178px;-->
<!--    height: 178px;-->
<!--    display: block;-->
<!--  }-->
<!--  .el-upload .el-upload&#45;&#45;text {-->
<!--    position: center;-->
<!--  }-->
<!--</style>-->

<!--<script>-->
<!--  export default {-->
<!--    data() {-->
<!--      return {-->
<!--        imageUrl: ''-->
<!--      };-->
<!--    },-->
<!--    methods: {-->
<!--      handleAvatarSuccess(res, file) {-->
<!--        this.imageUrl = URL.createObjectURL(file.raw);-->
<!--      },-->
<!--      beforeAvatarUpload(file) {-->
<!--        const isJPG = file.type === 'image/jpeg';-->
<!--        const isLt2M = file.size / 1024 / 1024 < 2;-->

<!--        if (!isJPG) {-->
<!--          this.$message.error('上传头像图片只能是 JPG 格式!');-->
<!--        }-->
<!--        if (!isLt2M) {-->
<!--          this.$message.error('上传头像图片大小不能超过 2MB!');-->
<!--        }-->
<!--        return isJPG && isLt2M;-->
<!--      }-->
<!--    }-->
<!--  }-->
<!--</script>-->