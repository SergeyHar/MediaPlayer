package am.ACA.model.bean;

import java.util.Date;
import java.util.List;

public class PlayList {
    private int id;
    private String name;
    private List<Track> tracks;
    private Date dateCreated;

    public PlayList() {
    }

    public PlayList(int id, String name, List<Track> tracks) {
        this.id = id;
        this.name = name;
        this.tracks = tracks;
    }

    public PlayList(int id, String name, List<Track> tracks, Date dateCreated) {
        this.id = id;
        this.name = name;
        this.tracks = tracks;
        this.dateCreated = dateCreated;
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

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

}
