package day1;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import java.util.Scanner;
public class YouTube {
    //states(variable)
    int likes;
    float videoLength;
    String category;
    long views;
    String comments;
    String title;
    String channel;
    boolean recomend;
    public static void streaming(){
    }
    public static void chat(){

    }
    public static void playMovie(){
    }
    public static void like(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of likes");
        int likes=input.nextInt();

        if(likes>1000){
            System.out.println("1K+ likes");}
            else{
                System.out.println("likes below 1k");}
    }

    public static void createChannel(){
    }
    public static void main(String[] args) {
        YouTube ob = new YouTube();
        ob.chat();
       // YouTube.like();
    }

    /*behavior(functions)
        live streaming
       chat
       play movies/songs
       create channel
        like,dislike
*/

}
