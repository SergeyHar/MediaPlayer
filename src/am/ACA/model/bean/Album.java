package am.ACA.model.bean;

import java.util.Date;
import java.util.List;


public class Album {
    private int id;
    private String name;
    private Date publicDate;
    private Artist artist;
    private List<Music> musics;
    private String description;

    public Album(int id, String name, Date publicDate, Artist artist, List<Music> musics, String description) {
        this.id = id;
        this.name = name;
        this.publicDate = publicDate;
        this.artist = artist;
        this.musics = musics;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(Date publicDate) {
        this.publicDate = publicDate;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Album() {
    }

}
