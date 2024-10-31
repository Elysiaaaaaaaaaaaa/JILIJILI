package com.example.bili_server.service.impl;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bili_server.DTO.LoginDTO;
import com.example.bili_server.DTO.RegisterDTO;
import com.example.bili_server.DTO.Result;
import com.example.bili_server.pojo.User;
import com.example.bili_server.mapper.UserMapper;
import com.example.bili_server.service.UserService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    @JsonProperty("userName")
    public Result login(LoginDTO loginDTO) {
        if (StrUtil.isEmpty(loginDTO.getUsername())){
            return new Result(400,"账号不能为空","");
        }
        if (StrUtil.isEmpty(loginDTO.getPassword())){
            return new Result(400,"密码不能为空","");
        }
//        通过登录名查询用户
        User user = lambdaQuery().eq(User::getUsername, loginDTO.getUsername()).one();
        if (user!=null&&user.getPassword().equals(loginDTO.getPassword())){
            return new Result(200,"登录成功",user);
        }
        return new Result(400,"用户名或密码错误","");
    }

    @Override
    public Result register(RegisterDTO registerDTO) {
        if (StrUtil.isEmpty(registerDTO.getUsername())){
            return new Result(400,"账号不能为空","");
        }
        if (StrUtil.isEmpty(registerDTO.getPassword())){
            return new Result(400,"密码不能为空","");
        }
        if (StrUtil.isEmpty(registerDTO.getConfirm())){
            return new Result(400,"请再次输入密码","");
        }
        if (!registerDTO.getPassword().equals(registerDTO.getConfirm())){
            return new Result(400,"两次输入的密码不一样","");
        }
        User user = lambdaQuery().eq(User::getUsername, registerDTO.getUsername()).one();
        if (user!=null){
            return new Result(400,"此用户已存在","");
        }
        Integer id = RandomUtil.randomInt(4, Integer.MAX_VALUE);
        userMapper.insert(new User(id,registerDTO.getUsername(),registerDTO.getPassword()));
        return new Result(200,"注册成功，前往登录页面",registerDTO);

    }

    @Override
    public User getUser(String userName) {
//        User oneUser = lambdaQuery().eq(User::getUserName, userName).one();
        return null;
    }

    @Override
    public List<User> selectAllUser() {
        List<User> users = userMapper.selectList(null);
        return users;
    }

}
