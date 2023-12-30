package com.example.jenkijns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class JenkijnsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkijnsApplication.class, args);
    }
    @GetMapping("/hello")
    public String getHelloWorld(){
        return"Hello World";
    }


}
