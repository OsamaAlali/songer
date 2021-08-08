package com.example.songoer.controller;

import com.example.songoer.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String getAlbum(Model m){
        Album a1=new Album("ajlun","song1",12,180,"https://media-cdn.tripadvisor.com/media/photo-s/0e/80/17/9e/natula.jpg");
        Album a2=new Album("amman","song2",20,40,"https://media-cdn.tripadvisor.com/media/photo-s/0e/80/17/9e/natula.jpg");
        Album a3=new Album("irbid","song3",30,80,"https://media-cdn.tripadvisor.com/media/photo-s/0e/80/17/9e/natula.jpg");
        List<Album> list =new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        m.addAttribute("list",list);
        return "albumst.html";
    }
}
