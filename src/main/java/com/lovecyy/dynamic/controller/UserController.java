package com.lovecyy.dynamic.controller;

import com.lovecyy.dynamic.pojo.User;
import com.lovecyy.dynamic.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @GetMapping("list")
    public List<User> list(){
        List<User> list = userService.list();
        System.out.println(list);
        return list;

    }
}
