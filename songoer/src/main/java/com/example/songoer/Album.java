package com.example.songoer;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
  private  String title;
  private String artist;
  private  int songCount;
  private int length;
  private String imageUrl;
@OneToMany(mappedBy = "albums")
private List<Song> albumSong;

  public  Album(){

}

    public Album(String title, String artist, int songCount, int length, String imageUrl, List<Song> albumSong) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
        this.albumSong = albumSong;
    }

    public List<Song> getAlbumSong() {
        return albumSong;
    }

    public void setAlbumSong(List<Song> albumSong) {
        this.albumSong = albumSong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
