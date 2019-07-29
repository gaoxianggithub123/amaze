package com.demo.amaze.login.controller;

import com.demo.amaze.login.entity.User;
import com.demo.amaze.login.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    UserMapper userMapper;
    @PostMapping("/a")
    public String register(User user){
        User aa = userMapper.findUser(user.getName());

        if(aa == null){
            userMapper.registerUser(user.getMail(),user.getName(),user.getPassword());
            return "注册成功";
        }else{
            return "用户已存在";
        }

    }
}
