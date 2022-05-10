package day25;

import java.util.logging.Logger;

public class GenericPractice {
    public static void main(String[] args) {

        GenericPair<String> genericPair = new GenericPair<String>("name","taman");
        GenericPair<Integer> genericPair1 = new GenericPair<Integer>("Age",30);
String genericPairValue= genericPair.getValue();
        int genericPairValue1= genericPair1.getValue();
        Logger.getGlobal().info(String.valueOf(genericPair));
        Logger.getGlobal().info(String.valueOf(genericPair1));
    }
}
