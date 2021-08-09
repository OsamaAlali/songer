package com.example.songoer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Captilize {
@GetMapping("/capitalize/{capword}")
    public  String getCap(Model m, @PathVariable String capword){
    String cap=capword.toUpperCase();
    m.addAttribute("capword",cap);
    return  "cap.html";
}
}
