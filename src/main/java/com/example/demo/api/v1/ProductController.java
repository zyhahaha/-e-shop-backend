package com.example.demo.api.v1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/product")
public class ProductController {
    @PostMapping("/create")
    public String create() {


        return "create successful";
    }

    @PostMapping("/update")
    public String update() {


        return "update successful";
    }

    @DeleteMapping ("/delete")
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