package com.example.songoer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
    @GetMapping("/")
//    @ResponseBody
    public  String getHome(){

        return "home.html";
    }

}
