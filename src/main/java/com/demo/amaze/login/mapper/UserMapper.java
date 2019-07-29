package com.demo.amaze.login.mapper;

import com.demo.amaze.login.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM `user` WHERE name =#{name}")
    User findUser(@Param("name") String name);
    @Insert("INSERT INTO `user`(mail,name,password) VALUES(#{mail},#{name},#{password})")
    int registerUser(@Param("mail") String mail,@Param("name") String name,@Param("password") String password);
}
