package com.example.bili_server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bili_server.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
