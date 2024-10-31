<template>
  <div class="container">
    <!-- <img src="../assets/img/YaeMiko.png" alt=""> -->
    <div class="UploadPage">
    <el-form :model="uploadForm" :rules="rules" ref="uploadForm" label-width="100px" class="uploadForm">
      <el-form-item label="视频标题" prop="title" class="mediaTitle">
        <el-input v-model="uploadForm.title"></el-input>
      </el-form-item>
      <el-form-item label="视频分类" prop="category" class="mediaCategory">
        <el-select v-model="uploadForm.category" placeholder="请选择视频分类">
          <div v-for="item in categoryList" :key="item.value">
            <el-option :label="item.name" :value="item.value"></el-option>
          </div>
        </el-select>
      </el-form-item>
      <el-form-item label="视频标签" prop="tags">
        <el-tag :key="tag" v-for="tag in uploadForm.tags" closable :disable-transitions="false" @close="handleClose(tag)">
          {{ tag }}
        </el-tag>
        <el-input class="input-new-tag" v-if="inputVisible" v-model="inputValue" ref="saveTagInput" size="small"
          @keyup.enter.native="handleInputConfirm" @blur="handleInputConfirm">
        </el-input>
        <el-button v-else class="button-new-tag" size="small" @click="showInput">+ New Tag</el-button>
      </el-form-item>
      <el-form-item label="视频文件" prop="mediaFile">
        <a class="a-upload mediaInputDiv">
          <input type="file" class="mediaFileInput" ref="mediaContext" multiple>点击上传视频文件
        </a>
      </el-form-item>
      <el-form-item label="视频封面" prop="coverFile">
        <a class="a-upload coverInputDiv">
          <input type="file" class="coverFileInput" ref="coverContext" multiple>点击上传视频封面
        </a>
      </el-form-item>
      <el-form-item>
        <el-button type="warning" plain @click="uploadMedia('uploadForm')">上传视频</el-button>
      </el-form-item>
    </el-form>
  </div>
  </div>
  
</template>
<script>
import axios from 'axios'
export default {
  data() {
    return {
      uploadForm: {
        title: '',
        tags: [],
        category: '',
      },
      categoryList: [{ name: '番剧', value: '1' }, { name: '国创', value: '2' }, { name: '综艺', value: '3' }, { name: '动画', value: '4' }, { name: '鬼畜', value: '5' }, { name: '舞蹈', value: '6' }, { name: '娱乐', value: '7' }, { name: '科技', value: '8' }, { name: '美食', value: '9' }, { name: '汽车', value: '10' }, { name: '运动', value: '11' }, { name: '电影', value: '12' }, { name: '电视剧', value: '13' }, { name: '纪录片', value: '14' }, { name: '游戏', value: '15' }, { name: '音乐', value: '16' }, { name: '影视', value: '17' }, { name: '知识', value: '18' }, { name: '咨询', value: '19' }, { name: '生活', value: '20' }, { name: '时尚', value: '21' }, { name: '动物圈', value: '22' },],

      inputVisible: false,
      inputValue: '',
      rules: {
        title: [
          { required: true, message: '请输入视频标题', trigger: 'blur' },
          { min: 2, max: 70, message: '长度在 2 到 70 个字符', trigger: 'blur' }
        ],
        category: [
          { required: true, message: '请选择视频分类', trigger: 'change' }
        ],
        // mediaFile: [
        // { required: true, message: '请选择视频文件', trigger: 'change' }
        // ],
        tags: [
          { required: true, message: '请选择视频标签', trigger: 'blur' }
        ],
        // coverFile: [
        // { required: true, message: '请选择视频封面', trigger: 'change' }
        // ]
      },
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
    // mediaChange() {
    //   const mediaInputDiv = document.querySelector('.mediaInputDiv')
    //   const mediaInput = document.querySelector('.mediaFileInput')
    //   mediaInputDiv.innerHTML = mediaInput.files[0].name
    // },
    // coverChange() {
    //   const coverInputDiv = document.querySelector('.coverInputDiv')
    //   const coverInput = document.querySelector('.coverFileInput')
    //   coverInputDiv.innerHTML = coverInput.files[0].name
    // },
    uploadMedia(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          const uploadFormData = new FormData()
          uploadFormData.append('title', this.uploadForm.title)
          uploadFormData.append('category', this.uploadForm.category)
          uploadFormData.append('tags', this.uploadForm.tags)
          let mediaInputFile = this.$refs.mediaContext
          let coverInputFile = this.$refs.coverContext
          const mediaFile = mediaInputFile.files[0]
          const coverFile = coverInputFile.files[0]
          uploadFormData.append('media', mediaFile)
          uploadFormData.append('cover', coverFile)
          axios.post(`${process.env.VUE_APP_SERVER_GATEWAY}` + '/media/upload', uploadFormData, {
            headers: {
              'Content-Type': 'multipart/form-data',
              authorization: `Bearer ${this.access_token}`,
            }
          }).then(response => {
            if (response.data.code === 1) {
              this.$message({
                message: '上传成功',
                type: 'success'
              });
            } else {
              this.$message({
                message: response.data.msg,
                type: 'warning'
              });
            }
          }).catch(error => {
            this.errorCatch(error)

          });
        } else {
          return false;
        }
      });

    },
    handleClose(tag) {
      this.uploadForm.tags.splice(this.uploadForm.tags.indexOf(tag), 1);
    },

    showInput() {
      this.inputVisible = true;
      this.$nextTick(_ => {
        this.$refs.saveTagInput.$refs.input.focus();
      });
    },

    handleInputConfirm() {
      let inputValue = this.inputValue;
      if (inputValue) {
        this.uploadForm.tags.push(inputValue);
      }
      this.inputVisible = false;
      this.inputValue = '';
    },
    async refreshToken() {
      this.access_token = localStorage.getItem('access_token')
      if (this.access_token === '' || this.access_token === null) {
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
    },
  },
  created() {
    this.refreshToken()
  }
}
</script>

<style scoped>
.UploadPage {
  width: 700px;
  height: 1000px;
  margin: 0 auto;
}

.container {
  background-image: url('../assets/img/YaeMiko.png');
  background-size: cover;
  background-repeat: no-repeat;
  background-position: center;
}


.a-upload {
  position: relative;
  display: inline-block;
  background: #D0EEFF;
  border: 1px solid #99D3F5;
  border-radius: 4px;
  padding: 4px 12px;
  overflow: hidden;
  color: #1E88C7;
  text-decoration: none;
  text-indent: 0;
  line-height: 20px;
}

.a-upload input {
  position: absolute;
  font-size: 100px;
  right: 0;
  top: 0;
  opacity: 0;
}

.a-upload:hover {
  background: #AADFFD;
  border-color: #78C3F3;
  color: #004974;
  text-decoration: none;
}


.mediaTitle {
  width: 400px;
}
</style>