package am.ACA.controller.interfaces;


public interface ControllerInt extends AuthorisationControllerInt, VoiceControllerInt {
    String inputCommand();

    void start();

    void play();

    void pause();

    void stop();

    void addMusic();

    void addAlbum();

    void deleteMusic();

    void deleteAlbum();

    void addPlaylist();

    void viewPlaylist();

    void info();

    void exit();


}
