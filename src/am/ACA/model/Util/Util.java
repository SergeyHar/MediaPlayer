package am.ACA.model.Util;

import am.ACA.model.bean.User;

import java.io.File;

public class Util {


    public static User loginUser = null;
    public static User playMusic = null;
    public static String path = "";
    public static int userNextId = 0;
    public static int trackNextAnIntId = 0;
    public static int playlistNextAnIntId = 0;
    public static int artistNextAnIntId = 0;

    public static String projectDirectory() {
        File file = new File(path);
        file.mkdirs();
        return path;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }



}
