package com.example.demo.mysqlclass;

import com.example.demo.mysqlclass.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    @Select("select * from shop_user order by id desc")
    List<User> getUserList();

    @Insert("insert into shop_user(username,password,mobile,role) values(#{username},#{password},#{mobile},#{role})")
    int AddUser(User user);
}
