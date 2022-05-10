package day22;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.time.Instant;

public class InterfaceCalbackExample {

    public static void main(String[] args) {

       /* ActionListener actionListener = new TimerListener();
            Timer timer = new Timer(1000,actionListener);
            timer.start();

            JOptionPane.showMessageDialog(null,"quit program?");
            System.exit(0);
*/

        ActionListener actionListener = e -> {
            System.out.println("Not using extra class, At the tone, the time is"+ Instant.ofEpochMilli(e.getWhen()));
            Toolkit.getDefaultToolkit().beep();
        };
            Timer timer = new Timer(1000,actionListener);
            timer.start();

            JOptionPane.showMessageDialog(null,"quit program?");
            System.exit(0);

    }
}
