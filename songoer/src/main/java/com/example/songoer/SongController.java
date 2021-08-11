package com.example.songoer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumsRepository albumsRepository;

    @PostMapping ("/add-song")

//@ModelAttribute Song song,
        public RedirectView addSong( @ModelAttribute Song song, Model model) {
       Album a1=albumsRepository.findById(1).get();
            model.addAttribute("song",song);
            songRepository.save(song);

          return new RedirectView("/songs");

    }

    @GetMapping ("/songs/{id}")
    public  String getSongById(@PathVariable(value = "id") Integer id, Model m){
        Song song=songRepository.findById(id).get();
        m.addAttribute("song",song);
        return "songs.html";
    }
@GetMapping("/songs")
    public String getAllSong(Model m){

        m.addAttribute("song",songRepository.findAll());
    System.out.println(songRepository.findAll());
    return  "songs.html";
}

}
