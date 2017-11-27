package finalproject;

import javax.swing.*;
import java.awt.event.*;

public class Main implements ActionListener {
  public static void main( String[] args) {
    Main p1 = new Main();
  }

    JFrame frame=new JFrame("Hungry Snake");
    JButton button;

    Main()
    {
      button=new JButton("Start Game");
      frame.setSize(400,400);
      frame.setVisible(true);
      frame.setLayout(null);
      frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      frame.getContentPane().add(button);
      button.setBounds(120,120,100,30);

      button.addActionListener(this);
    }

  public void actionPerformed(ActionEvent e)
  {
    frame.dispose();
    gamePlay p2=new gamePlay();
  }


}
