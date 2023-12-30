package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame20 extends Frame
{
    TextField tf;
    Button b;
    int count=0;
    
    MyFrame20()
    {
        super("Event Demo");
        
        tf=new TextField("0",20);
        b=new Button("Click");
        
        setLayout(new FlowLayout());
        add(tf);
        add(b);
        b.addActionListener((ActionEvent ae)-> {count++;tf.setText(String.valueOf(count));});
        
    }
        
}

public class nDifferentWayOfHandlingEvent4 
{
    public static void main(String[] args) 
    {
        MyFrame20 f=new MyFrame20();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}