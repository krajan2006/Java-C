package Swing2;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class MyFrame4 extends JFrame 
{
    JLabel l;
    JTextField tf;
    JButton b;
    
    JPanel p;
    
    MyFrame4()
    {
        l=new JLabel("Name");
        tf=new JTextField(20);
        b=new JButton("OK");
        p=new JPanel();
        
        p.add(l);
        p.add(tf);
        p.add(b);
        
        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.CENTER,   TitledBorder.LEFT);
        p.setBorder(br);
        
        setLayout(new FlowLayout());
        add(p);
    }
   
}
public class eBorder
{
    
    public static void main(String[] args) 
    {
       MyFrame4 f=new MyFrame4();
       f.setSize(800,800);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}