package com.example.demo.mysqlclass;

import com.example.demo.mysqlclass.model.User;
import com.example.demo.mysqlclass.serverimpl.UserServerimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/adduser")
    public String addUser(User user)
    {
        return userServer.AddUser(user);
    }

}
