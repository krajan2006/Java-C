package AWT;

import java.awt.*;

public class CreatFrame1 
{
    public static void main(String[] args) 
    {
        //create frame with title
        Frame f = new Frame("My App");
        f.setLayout(new FlowLayout());

        //initialies component
        Label l = new Label("Name");
        TextField tx = new TextField(20);
        Button b = new Button("OK");

        //add component to frame
        f.add(l);
        f.add(tx);
        f.add(b);

        //to visible frame
        f.setVisible(true);

        //setting size of frame
        f.setSize(600, 600);

    }
}
