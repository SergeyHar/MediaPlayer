package am.ACA.model.bean;


public class Track {
    private int id;
    private Album album;
    private Music music;

    public Track() {

    }

    public Track(int id, Music music) {
        this.id = id;
        this.music = music;
    }

    public Track(int id, Album album) {
        this.id = id;
        this.album = album;
    }

    public Track(int id, Album album, Music music) {
        this.id = id;
        this.album = album;
        this.music = music;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
