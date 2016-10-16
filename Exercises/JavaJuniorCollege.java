import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Luke on 17/10/2016.
 */
public class JavaJuniorCollege extends JFrame implements ActionListener
{
    JMenuBar mainBar = new JMenuBar();
    JMenu menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Campuses");
    JMenu menu3 = new JMenu("Degrees");
    JMenu menu4 = new JMenu("Activities");
    JMenuItem exit = new JMenuItem("Exit");
    JMenuItem east = new JMenuItem("East");
    JMenuItem south = new JMenuItem("South");
    JMenuItem accounting = new JMenuItem("Accounting");
    JMenuItem computers = new JMenuItem("Computer Information Systems");
    JMenuItem marketing = new JMenuItem("Marketing");
    JMenuItem frisbee = new JMenuItem("Frisbee team");
    JMenuItem boardgame = new JMenuItem("Board Gamers");
    JLabel label1 = new JLabel("    Java Junior College    ");
    JLabel lineLabel = new JLabel("------------------------------");
    JLabel label2 = new JLabel();
    public JavaJuniorCollege()
    {
        setTitle("Summervale Resort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        mainBar.add(menu2);
        mainBar.add(menu3);
        mainBar.add(menu4);
        menu1.add(exit);
        menu2.add(east);
        menu2.add(south);
        menu3.add(accounting);
        menu3.add(computers);
        menu3.add(marketing);
        menu4.add(frisbee);
        menu4.add(boardgame);
        exit.addActionListener(this);
        east.addActionListener(this);
        south.addActionListener(this);
        accounting.addActionListener(this);
        computers.addActionListener(this);
        marketing.addActionListener(this);
        frisbee.addActionListener(this);
        boardgame.addActionListener(this);
        add(label1);
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        lineLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(lineLabel);
        add(label2);
        label2.setFont(new Font("Arial", Font.ITALIC, 16));
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        String text = "  ";
        if(source == exit)
            System.exit(0);
        else if(source == south)
            text = "South campus on the banks of a beautiful river";
        else if(source == east)
            text = "East campus convenient to downtown";
        else if(source == accounting)
            text = "Accounting classes taught by CPAs";
        else if(source == computers)
            text = "CIS classes include Java and C++";
        else  if(source == marketing)
            text = "Marketing classes with real-world experience";
        else  if(source == frisbee)
            text = "Our frisbee team is the division champ";
        else
            text = "Join our board game club for some fun comps!";
        label2.setText(text);
    }

    public static void main(String[] args)
    {
        JavaJuniorCollege frame = new JavaJuniorCollege();
        final int WIDTH = 400;
        final int HEIGHT = 150;
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}
