package com.example.demo.api.v1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    @PostMapping("/register")
    public String addUser() {


        return "add successful";
    }

    @PostMapping("/login")
    public String editUser() {


        return "edit successful";
    }

    @DeleteMapping("/delete")
    public String delete() {


        return "delete successful";
    }


    @GetMapping("/list")
    public String getList() {


        return "get list successful";
    }

    @GetMapping("/info")
    public String getInfo() {


        return "get info successful";
    }
}
