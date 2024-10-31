package com.example.bili_server.controller;

import com.example.bili_server.DTO.LoginDTO;
import com.example.bili_server.DTO.RegisterDTO;
import com.example.bili_server.DTO.Result;
import com.example.bili_server.pojo.User;
import com.example.bili_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody LoginDTO loginDTO){
        return userService.login(loginDTO);
    }
    @PostMapping("/register")
    public Result register(@RequestBody RegisterDTO registerDTO){
        return userService.register(registerDTO);
    }
    @GetMapping("/getUser")
    public User getUser(@RequestParam String userName){
        User user = userService.getUser(userName);
        return user;
    }
    @GetMapping("/selectAllUser")
    public List<User> getAllUser(){
        List<User> users = userService.selectAllUser();
        return users;
    }
}
