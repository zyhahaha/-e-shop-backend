package com.example.demo.api.v1.user;

import com.example.demo.api.v1.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServer {
    List<User> getUserList();
    String AddUser(User user);
}
