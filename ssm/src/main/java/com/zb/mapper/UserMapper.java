package com.zb.mapper;
import com.zb.entity.User;
import org.apache.ibatis.annotations.Param;
public interface UserMapper {
    public User findUserLogin(@Param("uname") String uname ,@Param("upwd") String upwd);
}
