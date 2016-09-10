package am.ACA.controller.implementations;

import am.ACA.controller.interfaces.ControllerInt;
import am.ACA.model.Util.Exceptions.InvalidArgumentException;
import am.ACA.model.Util.Exceptions.NullArgumentException;
import am.ACA.model.Util.Util;
import am.ACA.model.bean.Album;
import am.ACA.model.bean.Music;
import am.ACA.model.bean.PlayList;
import am.ACA.model.bean.User;
import am.ACA.repository.implementations.*;
import am.ACA.repository.interfaces.RepositoryInt;
import am.ACA.repository.interfaces.TrackRepositoryInt;
import am.ACA.repository.interfaces.VoiceRepositoryInt;

import java.util.Scanner;



public class Controller implements ControllerInt {

    private Scanner scanner = new Scanner(System.in);
    private String commandLine;

    private RepositoryInt userRepository = new UserRepository();
    private RepositoryInt albumRepository = new AlbumRepository();
    private RepositoryInt playListRepository = new PlayListRepository();
    private RepositoryInt musicRepository = new MusicRepository();
    private TrackRepositoryInt trackRepository = new TrackRepository();
    private VoiceRepositoryInt voiceRepository = new VoiceRepository();

    @Override
    public String inputCommand() {
        commandLine = scanner.nextLine();
        return commandLine;
    }

    @Override
    public void signIn() {
        String name;
        String pass;
        Util.printMessage("Please write login");
        name = inputCommand();
        Util.printMessage("Please write password");
        pass = inputCommand();
        if (name.equals("Exit") || pass.equals("Exit")) {
            exit();
        } else if (!name.equals("") && !pass.equals("")) {
            User user = new User();
            user.setName(name);
            user.setPassword(pass);
            try {
                if (userRepository.existingObjectCheckup(user)) {
                    Util.loginUser = user;
                }
            } catch (InvalidArgumentException e) {
                e.printStackTrace();
            }

        } else {
            Util.printMessage("Please correct login and password");
            signIn();
        }

    }

    @Override
    public void signUp() {
        String login;
        String password;
        Util.printMessage("Please write login");
        login = inputCommand();
        Util.printMessage("Please write password");
        password = inputCommand();

        if (!login.equals(null) && !password.equals(null)) {
            User user = new User();
            try {
                userRepository.add(user);
            } catch (InvalidArgumentException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void start() {
        switch (inputCommand()) {
            case "Sign In":
                signIn();
                start();
                break;
            case "Sign Up":
                signUp();
                start();
                break;
            case "play":
                play();
                start();
                break;
            case "pause":
                pause();
                start();
                break;
            case "stop":
                stop();
                start();
                break;
            case "Add Playlist":
                addPlaylist();
                start();
                break;
            case "Show Playlist":
                viewPlaylist();
                start();
                break;
            case "Add Music":
                addMusic();
                start();
                break;
            case "Add Album":
                addAlbum();
                start();
                break;
            case "Delete Music":
                deleteMusic();
                start();
                break;
            case "Delete Album":
                deleteAlbum();
                start();
                break;
            case "Info":
                info();
                start();
                break;
            case "exit":
                exit();
                break;
            default:
                inputCommand();
                break;
        }
    }


    @Override
    public void play() {
        if (Util.playMusic.equals(null)) {
            try {
                throw new NullArgumentException("");
            } catch (NullArgumentException e) {
                Util.printMessage(String.valueOf(e));
                Util.printMessage("Choose music");
                try {
                    musicRepository.getList();
                } catch (InvalidArgumentException e1) {
                    e1.printStackTrace();
                }
            }
        } else {
            trackRepository.play(Util.playMusic.getId());
        }


    }

    @Override
    public void pause() {
        trackRepository.pause(Util.playMusic.getId());
    }

    @Override
    public void stop() {
        trackRepository.stop(Util.playMusic.getId());
    }

    @Override
    public void addMusic() {
        String fileDirectory = inputCommand();
        Music music = new Music();
        music.setFileDirectory(fileDirectory);
        try {
            musicRepository.add(music);
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addAlbum() {


    }

    @Override
    public void deleteMusic() {

        String musicName = inputCommand();
        Music music = new Music();
        music.setName(musicName);
        try {
            musicRepository.delete(music);
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteAlbum() {
        String albumName = inputCommand();
        Album album = new Album();
        album.setName(albumName);
        try {
            albumRepository.delete(album);
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addPlaylist() {
        String playListName = inputCommand();
        PlayList playList = new PlayList();
        playList.setName(playListName);
        try {
            playListRepository.add(playList);
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void viewPlaylist() {
        String playListName = inputCommand();
        PlayList playList = new PlayList();
        playList.setName(playListName);
        try {
            if (playListRepository.existingObjectCheckup(playList)) {
                Util.printMessage("show");
            }
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void info() {
        Util.printMessage("APP info ");

    }

    @Override
    public void voicePlus() {
        voiceRepository.upVoice();

    }

    @Override
    public void voiceMinus() {
        voiceRepository.downVoice();
    }

    @Override
    public void exit() {
        Util.printMessage("Good bay");
        System.exit(0);
    }
}
