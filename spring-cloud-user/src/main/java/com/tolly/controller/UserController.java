package com.tolly.controller;

import com.tolly.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/16.
 */
@RestController
public class UserController {


    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){

        User user = null;
        if(null!=id&&id.equals(1l)){
            user = new User();
            user.setId(1l);
            user.setAge(20);
            user.setName("张三");
            user.setSex("男");
        }

        return user;
    }

}
