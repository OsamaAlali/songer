package com.example.songoer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@ComponentScan(basePackages = {"com.example.songoer"})
public class AlbumController {

  @Autowired
    AlbumsRepository albumsRepository;


    @GetMapping("/albums")
    public String getAlbum(Model m){
//        Album a1=new Album("ajlun","song1",12,180,"https://media-cdn.tripadvisor.com/media/photo-s/0e/80/17/9e/natula.jpg");
//        Album a2=new Album("amman","song2",20,40,"https://media-cdn.tripadvisor.com/media/photo-s/0e/80/17/9e/natula.jpg");
//        Album a3=new Album("irbid","song3",30,80,"https://media-cdn.tripadvisor.com/media/photo-s/0e/80/17/9e/natula.jpg");
//        List<Album> list =new ArrayList<>();
//        list.add(a1);
//        list.add(a2);
//        list.add(a3);
//        m.addAttribute("list",list);
        m.addAttribute("list",albumsRepository.findAll());

        return "albumst.html";
    }

    // Post
    @PostMapping("/addalbums")
    public RedirectView addSubmit(@ModelAttribute Album album, Model model) {
        model.addAttribute("album",album);
        albumsRepository.save(album);
        return new RedirectView("/albums");
    }

}
