package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    String home() {
        return "Spring is here!";
    }

    @GetMapping("/hello")
    String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}