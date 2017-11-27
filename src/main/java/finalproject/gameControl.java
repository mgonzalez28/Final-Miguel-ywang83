package finalproject;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.LinkedList;
import java.util.Random;


public class gameControl extends Panel {

    private LinkedList<Point> snake;
    private Point apple;

    int appleX = 200;
    int appleY = 200;

    int snakeX = 300;

    int pointWidth = 20;
    int pointHeight = 20;

    public void paint(Graphics graphic){

        // create the apple
        graphic.setColor(Color.yellow);
        graphic.fillOval(appleX,appleY,pointWidth,pointHeight);
    }
}