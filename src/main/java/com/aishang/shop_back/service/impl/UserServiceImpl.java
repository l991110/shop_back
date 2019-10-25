package com.aishang.shop_back.service.impl;

import com.aishang.shop_back.dao.UserMapper;
import com.aishang.shop_back.po.User;
import com.aishang.shop_back.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
