package com.example.bili_server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.bili_server.DTO.LoginDTO;
import com.example.bili_server.DTO.RegisterDTO;
import com.example.bili_server.DTO.Result;
import com.example.bili_server.pojo.User;

import java.util.List;


public interface UserService extends IService<User> {
    public Result login(LoginDTO loginDTO);
    public Result register(RegisterDTO registerDTO);
    public User getUser(String userName);
    public List<User> selectAllUser();

}
