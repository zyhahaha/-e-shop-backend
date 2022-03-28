package com.example.demo.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    @PostMapping("/add")
    public String addUser() {
        return "add successful";
    }

    @PostMapping("/edit")
    public String editUser() {
        return "edit successful";
    }
}
