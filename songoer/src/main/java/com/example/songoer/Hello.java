package com.example.songoer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {
@GetMapping("/hello")
    public  String getHello(){
    return  "hello.html";
}
}
