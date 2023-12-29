package AWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame4 extends Frame
{
    Label l1,l2;
    TextField tf;

    MyFrame4()
    {
        super("Textfield Demo");

        setLayout(new FlowLayout());

        l1=new Label("No text is entered yet");
        l2=new Label("Enter key is not yet hit");
        tf=new TextField(20);

        add(l1);
        add(l2);
        add(tf);
        Handler h=new Handler();
        tf.addActionListener(h);
        tf.addTextListener(h);
    }
    /*
    handler class is created because you might face error depends on device
    due to this key-word use in addActionListener and addTextListener
    when MyFrame4 implements TextListener,ActionListener
    */
    class Handler implements TextListener,ActionListener
    {
        @Override
        public void textValueChanged(TextEvent te) 
        {
            l1.setText(tf.getText());
        }

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            l2.setText(tf.getText());
        }
    }
}

public class gTextfieldAndTextevent 
{
    public static void main(String[] args) 
    {
        MyFrame4 f=new MyFrame4();
        f.setVisible(true);
        f.setSize(400,400);
    }
}
