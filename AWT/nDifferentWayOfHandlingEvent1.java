package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame17 extends Frame implements ActionListener
{
    TextField tf;
    Button b;
    int count=0;
    
    MyFrame17()
    {
        super("Event Demo");
        setLayout(new FlowLayout());
        
        tf=new TextField("0",20);
        b=new Button("Click");
        
        add(tf);
        add(b);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
       count++;
       tf.setText(String.valueOf(count));
        
    }
        
}

public class nDifferentWayOfHandlingEvent1 
{
    public static void main(String[] args) 
    {
        MyFrame17 f=new MyFrame17();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}