package com.wzh.demo.mapper;

import com.wzh.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {


    @Insert("insert into user (userId,userName) values (#{userId},#{userName})")
    public void add(User user);
}
