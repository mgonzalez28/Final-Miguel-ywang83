package finalproject;


import javax.swing.*;
import java.awt.*;

public class gamePlay {
    JFrame frame=new JFrame("Level 1");
    gameControl control = new gameControl();


    gamePlay()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(640,480);
        frame.add(control);
    }



}
