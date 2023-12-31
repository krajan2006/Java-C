package Swing2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener
{
    JLabel l;
    JButton b;
    int count=0;

    MyFrame()
    {
        super("JLabel And JButton");
        setLayout(new FlowLayout());

        l=new JLabel("Clicked "+count+" Times");
        b=new JButton("Click");

        add(l);
        add(b);
        add(new JButton("Cancel"));//creating cancel button 
        b.addActionListener(this);
        l.setToolTipText("Counting Clicks");//setting tip to label
        b.setIcon(new ImageIcon("  "));
        //to set icon for button give filename inside " "

        getRootPane().setDefaultButton(b);//setting b as defalt button
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        count++;
        l.setText("Clicked "+count+" Times");
    }
}

public class bJLabelAndJButton 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
