package finalproject;

import java.awt.*;
import java.util.LinkedList;

public class gameControl extends Panel implements Runnable {
    private LinkedList<Point> snake;
    private Point apple;

    private final int pointWidth = 15;
    private final int pointHeight = 15;

    private Graphics globalGraphics;
    private Thread runThread;

    public void paint(Graphics g) {
        globalGraphics = g.create();
        if (runThread == null) {
            runThread = new Thread(this);
            runThread.start();
        }

        snake = new LinkedList<Point>();
        apple = new Point(200, 10);
        snake.add(new Point(100, 100));
        snake.add(new Point(100, 115));
        snake.add(new Point(100, 130));
}

    public void Draw(Graphics g) {
        DrawSnake(g);
        DrawApple(g);
    }

    public void DrawSnake(Graphics g) {

        for (Point p : snake) {
            g.setColor(Color.GREEN);
            g.fillRect(p.x, p.y, pointWidth, pointHeight);
            g.setColor(Color.black);
            g.drawRect(p.x, p.y, pointWidth, pointHeight);
        }
    }

    public void DrawApple(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(apple.x, apple.y, pointWidth, pointHeight);
    }

    @Override
    public void run() {
        while (true) {
            Draw(globalGraphics);

            try {
                Thread.currentThread();
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
