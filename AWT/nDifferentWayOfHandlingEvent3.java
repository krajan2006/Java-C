package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame19 extends Frame 
{
    TextField tf;
    Button b;
    int count = 0;

    MyFrame19() 
    {
        super("Event Demo");
        setLayout(new FlowLayout());

        tf = new TextField("0", 20);
        b = new Button("Click");

        add(tf);
        add(b);
        b.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                count++;
                tf.setText(String.valueOf(count));

            }

        });
    }
}

public class nDifferentWayOfHandlingEvent3 
{
    public static void main(String[] args) 
    {
        MyFrame19 f = new MyFrame19();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}