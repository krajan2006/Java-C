package AWT;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class MyFrame7 extends Frame implements AdjustmentListener
{
    Scrollbar red,green,blue;
    TextField tf;

    MyFrame7()
    {
        super("Scrollbar Demo");
        setLayout(null);

        red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        tf=new TextField(20);

        tf.setBounds(50, 50, 300, 50);
        red.setBounds(50, 150, 300, 30);
        green.setBounds(50, 200, 300, 30);
        blue.setBounds(50, 250, 300, 30);

        add(tf);
        add(red);
        add(green);
        add(blue);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) 
    {
        tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
    }
}

public class hScrollbarAndAdjustmentevent 
{
    public static void main(String[] args) 
    {
        MyFrame7 f=new MyFrame7();
        f.setVisible(true);
        f.setSize(500,500);
    }
}
