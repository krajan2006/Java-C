package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame18 extends Frame 
{
    TextField tf;
    Button b;
    int count = 0;

    MyFrame18() 
    {
        super("Event Demo");
        setLayout(new FlowLayout());

        tf = new TextField("0", 20);
        b = new Button("Click");

        add(tf);
        add(b);
        b.addActionListener(new MyListener());
    }

    class MyListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent ae) 
        {
            count++;
            tf.setText(String.valueOf(count));

        }
    }

}

public class nDifferentWayOfHandlingEvent2 
{
    public static void main(String[] args) 
    {
        MyFrame18 f = new MyFrame18();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}