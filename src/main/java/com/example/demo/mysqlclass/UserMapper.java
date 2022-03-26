package com.example.demo.mysqlclass;

import com.example.demo.mysqlclass.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    @Select("select * from usertable order by user_id desc")
    List<User> getUserList();

}