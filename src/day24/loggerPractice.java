package day24;

import java.util.logging.Level;
import java.util.logging.Logger;

public class loggerPractice {

    private static final Logger myLogger=Logger.getLogger("day24");
    public static void main(String[] args) {


      /*  Logger.getGlobal().setLevel(Level.WARNING);
        Logger.getGlobal().severe("this is severe kind og log ");
        Logger.getGlobal().warning("this is warning kind og log ");
        Logger.getGlobal().info("this is info kind og log ");
        Logger.getGlobal().config("this is config kind og log ");*/

          myLogger.setLevel(Level.OFF);
        myLogger.severe("this is severe kind og log ");
       myLogger.warning("this is warning kind og log ");
        myLogger.info("this is info kind og log ");
        myLogger.config("this is config kind og log ");
    }
}
