package com.example.demo.api.v1.user.serverimpl;

import com.example.demo.api.v1.user.UserMapper;
import com.example.demo.api.v1.user.UserServer;
import com.example.demo.api.v1.user.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
        }
    }

    @Override
    public String AddUser(User user) {
        try {
            int i = userMapper.AddUser(user);
            return "添加成功" + i + "条数据";
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}
