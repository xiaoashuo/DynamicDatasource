package com.lovecyy.dynamic.mapper;

import com.lovecyy.dynamic.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserMapper {

    public List<User> list();

}
