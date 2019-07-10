package com.lovecyy.dynamic.service.impl;

import com.lovecyy.dynamic.annotation.DataSource;
import com.lovecyy.dynamic.annotation.DataSourceType;
import com.lovecyy.dynamic.mapper.UserMapper;
import com.lovecyy.dynamic.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    @DataSource(value = DataSourceType.SLAVE)
    public List<User> list(){
       return userMapper.list();
    }
}
