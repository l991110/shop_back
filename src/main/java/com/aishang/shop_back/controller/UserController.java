package com.aishang.shop_back.controller;

import com.aishang.shop_back.po.User;
import com.aishang.shop_back.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/test")
    public List<User> getAll(){
        List<User> allUser = userService.getAllUser();
        return allUser;
    }
}
