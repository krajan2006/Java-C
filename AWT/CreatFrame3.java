package AWT;

import java.awt.*;

public class CreatFrame3 extends Frame
{
    Label l;
    TextField tf;
    Button b;

    public CreatFrame3()
    {
        super("My App");
        //setting tittle by calling string argument constuctor of parent class

        setLayout(new FlowLayout());

        l=new Label("Name");
        tf=new TextField(20);
        b= new Button("OK");

        add(l);
        add(tf);
        add(b);
    }
    public static void main(String[] args) 
    {
        CreatFrame3 f = new CreatFrame3();
        f.setSize(600, 600);
        f.setVisible(true);

    }
}
