package com.demo.amaze.login.controller;

import com.demo.amaze.login.entity.User;
import com.demo.amaze.login.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/a/{name}/{password}")
    public String login(@PathVariable("name") String name, @PathVariable("password") String password){

        User aa = userMapper.findUser(name);

        if (aa.getName().equals(name)){
            if (aa.getPassword().equals(password)){
                return "index.html";

            }else{
                return "密码错误";
            }
        }else {
            return "用户名不存在";
        }
    }
}
