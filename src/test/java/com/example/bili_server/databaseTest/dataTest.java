package com.example.bili_server.databaseTest;

import com.example.bili_server.mapper.UserMapper;
import com.example.bili_server.pojo.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.examle.bili_server.mapper")
public class dataTest {
    @Autowired
    public UserMapper userMapper;
    @Test
    @DisplayName("新增数据")
    public void testInsert(){
        User user = new User(2,"jjj","123456");
        Integer id = userMapper.insert(user);
        System.out.println(id);
    }
    @Test
    @DisplayName("根据id进行查找")
    public void testSelectById(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }
    @Test
    @DisplayName("查找全部用户")
    public void testSelectAll(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users.size());
    }
    @Test
    @DisplayName("更新")
    public void testUpdate(){
        User user = new User();
        user.setUserId(2);
        user.setUsername("aaa");
        Integer i=userMapper.updateById(user);
        System.out.println(i);
    }
    @Test
    @DisplayName("删除")
    public void testDelete(){
        userMapper.deleteById(2);
    }
}
