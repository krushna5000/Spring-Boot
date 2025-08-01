package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Hi, Welcome to krushna!!!";
    }

    @RequestMapping("/about")
    public String about() {
        return "We don't teach, we Educate!!";
    }
}
