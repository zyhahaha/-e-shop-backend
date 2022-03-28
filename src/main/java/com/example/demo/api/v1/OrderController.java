package com.example.demo.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/order")
public class OrderController {
    @PostMapping("/create")
    public String create() {
        return "create successful";
    }

    @PostMapping("/confirm")
    public String confirm() {
        return "confirm successful";
    }

    @PostMapping("/cancel")
    public String cancel() {
        return "cancel successful";
    }

    @GetMapping("/info")
    public String getDetail() {
        return "get detail successful";
    }
}