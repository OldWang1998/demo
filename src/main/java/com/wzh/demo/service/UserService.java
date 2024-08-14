package com.wzh.demo.service;

import com.wzh.demo.mapper.UserMapper;
import com.wzh.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public void addUser(User user){
        userMapper.add(user);
    }
}
