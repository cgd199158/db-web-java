package com.cgd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ZcglApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZcglApplication.class, args);
    }

    @GetMapping("/hello")
    public String login(){
        return "Hello World!";
    }
}
