package AWT;

import java.awt.*;

public class cCreatFrame3 extends Frame
{
    Label l;
    TextField tf;
    Button b;

    public cCreatFrame3()
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
    public static void main(String[] args) 
    {
        cCreatFrame3 f = new cCreatFrame3();
        f.setSize(600, 600);
        f.setVisible(true);

    }
}
