package com.example.demo.api.v1.user;

import com.example.demo.api.v1.user.model.User;
import com.example.demo.api.v1.user.serverimpl.UserServerimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServerimpl userServer;

    @RequestMapping("/getuserlist")
    public List<User> getUserList()
    {
        return userServer.getUserList();
    }

    @PostMapping("/register")
    public String addUser(User user)
    {
        return userServer.AddUser(user);
    }

}
