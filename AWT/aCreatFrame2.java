package AWT;

import java.awt.*;

class MyFrame extends Frame
{
    Label l;
    TextField tf;
    Button b;

    public MyFrame()
    {
        super("Frame Demo");
        //setting tittle by calling string argument constuctor of parent class

        setLayout(new FlowLayout());

        l=new Label("Name");
        tf=new TextField(20);
        b= new Button("OK");

        add(l);
        add(tf);
        add(b);
    }
}

public class aCreatFrame2 
{
    public static void main(String[] args) 
    {
        MyFrame f = new MyFrame();
        f.setSize(600, 600);
        f.setVisible(true);

    }
}
