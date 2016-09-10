package am.ACA.controller;

import am.ACA.controller.implementations.Controller;
import am.ACA.controller.interfaces.ControllerInt;
import am.ACA.model.Util.Util;


public class MediaPlayerMain {
    public static void main(String[] args) {

        ControllerInt c = new Controller();
        Util.printMessage("Welcome please input path directory ");
        Util.path = c.inputCommand();
        Util.printMessage("Welcome please write input command ");
        c.start();

    }
}
