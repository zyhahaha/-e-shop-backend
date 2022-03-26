package com.example.demo.mysqlclass;

import com.example.demo.mysqlclass.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServer {
    List<User> getUserList();
}
