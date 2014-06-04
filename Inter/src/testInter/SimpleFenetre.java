package testInter;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Charly-Garma on 04/06/2014.
 */
public class SimpleFenetre extends JFrame{
    public SimpleFenetre(){
        super();
        build();
    }

    private void build(){
        setTitle("test");
        setSize(300,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.green);

        JLabel label = new JLabel("lol");
        panel.add(label);

        JButton bouton = new JButton(new IciAction(this, "lolol"));
        panel.add(bouton);

        return panel;
    }
}
