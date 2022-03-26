package com.example.demo.mysqlclass.serverimpl;

import com.example.demo.mysqlclass.UserMapper;
import com.example.demo.mysqlclass.UserServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.mysqlclass.model.User;
import java.util.List;

@Repository
public class UserServerimpl implements UserServer {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {

        try {
            List<User> users = userMapper.getUserList();

            return  users;
        }
        catch (Exception e)
        {
            throw e;
//            return null;
        }
    }
}
