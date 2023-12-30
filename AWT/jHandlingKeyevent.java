package AWT;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

class MyFrame13 extends Frame implements KeyListener
{
    Label l1,l2,l3,l4;

    MyFrame13()
    {
        super("KeyEvent Demo");
        setLayout(null);

        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");

        l1.setBounds(30,30,100,20);
        l2.setBounds(30,60,100,20);
        l3.setBounds(30,90,100,20);
        l4.setBounds(30,120,200,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);

    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
        l1.setText("Key Pressed");
        l2.setText("");
        
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        l2.setText("Key Relesed");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        l3.setText("Key Typed");
        l4.setText(new Date(e.getWhen())+"");
        
    }
}

public class jHandlingKeyevent 
{
    public static void main(String[] args) 
    {
        MyFrame13 f=new MyFrame13();
        f.setVisible(true);
        f.setSize(500,500);
    }
}
