package finalproject;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Random;

public class gameControl extends Panel implements Runnable, KeyListener{
    private LinkedList<Point> snake;
    private Point apple;

    private final int pointWidth = 15;
    private final int pointHeight = 15;

    private Graphics globalGraphics;
    private Thread runThread;

    private int direction = Direction.noDirection;

    public void paint(Graphics g) {
        globalGraphics = g.create();
        if (runThread == null) {
            runThread = new Thread(this);
            runThread.start();
        }

        snake = new LinkedList<>();
        apple = new Point();
        snake.add(new Point(100, 100));
        snake.add(new Point(100, 115));
        snake.add(new Point(100, 130));
        placeApple();

        this.addKeyListener(this);
    }

    public void Draw(Graphics g) {
        g.clearRect(0,0,600,480);
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

    public void placeApple(){
        Random ran = new Random();
        int randomX = ran.nextInt(600);
        int randomY = ran.nextInt(480);
        Point randomPoint = new Point(randomX,randomY);
        while ((snake.peekFirst()).equals(randomPoint)){
            randomX = ran.nextInt(600);
            randomY = ran.nextInt(480);
            randomPoint = new Point(randomX,randomY);
        }
        apple = randomPoint;
    }

    @Override
    public void run() {
        while (true) {
            move();
            Draw(globalGraphics);

            try {
                Thread.currentThread();
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void move() {
        Point head = snake.peekFirst();
        Point newPoint = head;
        switch (direction) {
            case Direction.up:
                newPoint = new Point(head.x, head.y - 15);
                break;
            case Direction.down:
                newPoint = new Point(head.x, head.y + 15);
                break;
            case Direction.left:
                newPoint = new Point(head.x - 15, head.y);
                break;
            case Direction.right:
                newPoint = new Point(head.x + 15, head.y);
                break;
        }
        snake.remove(snake.peekLast());
        snake.push(newPoint);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                direction = Direction.up;
                break;
            case KeyEvent.VK_DOWN:
                direction = Direction.down;
                break;
            case KeyEvent.VK_LEFT:
                direction = Direction.left;
                break;
            case KeyEvent.VK_RIGHT:
                direction = Direction.right;
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
