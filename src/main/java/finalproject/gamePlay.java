package finalproject;


import javax.swing.*;
import java.awt.*;

public class gamePlay {
    JFrame frame=new JFrame("Level 1");
    gameControl game = new gameControl();


    gamePlay()
    {
        game.setPreferredSize(new Dimension(640,480));
        game.setVisible(true);
        game.setFocusable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(640,480);
        frame.add(game);


    }



}
