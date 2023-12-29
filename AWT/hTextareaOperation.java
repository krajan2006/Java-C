package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame5 extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    MyFrame5()
    {
        super("TeaxtArea Demo");

        setLayout(new FlowLayout());

        l=new Label("No text Entered");
        ta=new TextArea(10,30);
        tf=new TextField(20);
        b=new Button("Click");

        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
       ta.insert(tf.getText(), ta.getCaretPosition());
    }


}

public class hTextareaOperation 
{
    public static void main(String[] args) 
    {
        MyFrame5 f=new MyFrame5();
        f.setVisible(true);
        f.setSize(500,500);
    }
}
