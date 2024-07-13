package com.example.test.demo_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/")
    public String welcome(){
        return "Helo amir deploying java spring boot";
    }

}
