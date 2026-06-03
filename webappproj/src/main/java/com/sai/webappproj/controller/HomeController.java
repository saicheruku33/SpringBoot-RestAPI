package com.sai.webappproj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "welcome to my learning path";
    }
    @RequestMapping("/about")
    public String about(){
        return "Aspring SDE learning JAVA DEV";
    }
}
