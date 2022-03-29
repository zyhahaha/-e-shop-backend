package com.example.demo.api.v1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cart")
public class CartController {
    @PostMapping("/create")
    public String create() {


        return "create successful";
    }

    @PostMapping("/update")
    public String update() {


        return "update successful";
    }

    @DeleteMapping("/delete")
    public String delete() {


        return "delete successful";
    }

    @GetMapping("/detail")
    public String getDetail() {


        return "get detail successful";
    }
}