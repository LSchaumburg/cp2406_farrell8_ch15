import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

/**
 * Created by Luke on 17/10/2016.
 */
public class JColourFrame extends JFrame implements ActionListener
{
    Button colourButton = new Button("Change");
    JPanel centerPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel westPanel = new JPanel();
    int count = 0;
    public JColourFrame()
    {
        super("JColourFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        centerPanel.add(colourButton);
        con.add(northPanel, BorderLayout.NORTH);
        con.add(southPanel, BorderLayout.SOUTH);
        con.add(eastPanel, BorderLayout.EAST);
        con.add(westPanel, BorderLayout.WEST);
        con.add(centerPanel, BorderLayout.CENTER);
        colourButton.addActionListener(this);
    }
    public static void main(String[] args)
    {
        JColourFrame cFrame = new JColourFrame();
        cFrame.setSize(350,250);
        cFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(count%5 == 0)
            northPanel.setBackground(Color.GREEN);
        else if(count%5==1)
            eastPanel.setBackground(Color.MAGENTA);
        else if(count%5==2)
            westPanel.setBackground(Color.ORANGE);
        else if(count%5==3)
            southPanel.setBackground(Color.RED);
        else
        {
            eastPanel.setBackground(Color.WHITE);
            southPanel.setBackground(Color.WHITE);
            northPanel.setBackground(Color.WHITE);
            westPanel.setBackground(Color.WHITE);
        }
        ++count;
    }
}
