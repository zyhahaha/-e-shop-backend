package com.example.demo.api.v1;

//import com.example.demo.sample.hero.Diana;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {
//    @Autowired
//    private Diana diana;

//    public BannerController(Diana diana) {
//        this.diana = diana;
//    }

    @GetMapping("/test")
    public String test() {
//        diana.r();
        return "hello test 666";
    }
}
