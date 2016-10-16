// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;

public class FixDebugFifteen2 extends JFrame
{
   JButton northb = new JButton("Left    ");
   JButton southb = new JButton("Down  ");
   JButton eastb = new JButton("Right ");
   JButton westb = new JButton("Center  ");
   JButton centerb = new JButton("Up");
   Container con = null;

   public FixDebugFifteen2()
   {
      con = this.getContentPane();
      con.setLayout(new BorderLayout());
      con.add(northb, BorderLayout.NORTH);
      con.add(southb, BorderLayout.SOUTH);
      con.add(eastb, BorderLayout.EAST);
      con.add(westb, BorderLayout.WEST);
      con.add(centerb, BorderLayout.CENTER);
   }
   public static void main(String[] args)
   {
      FixDebugFifteen2 f = new FixDebugFifteen2();
      f.setSize(300, 300);
      f.setVisible(true);
   }
}