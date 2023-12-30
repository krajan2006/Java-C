//Borderlayout
package AWT;

import java.awt.*;

class MyFrame9 extends Frame 
{
    Button b1, b2, b3, b4, b5;

    public MyFrame9() 
    {
        super("BorderLayout Demo");

        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");


        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);


        // Panel p=new Panel();
        // p.setLayout(new GridLayout(3,1));
        // p.add(new Button("Mon"));
        // p.add(new Button("Tue"));
        // p.add(new Button("Wen"));
        // add(p,BorderLayout.EAST);
    }
}

public class iLayoutManagers2 
{
    public static void main(String[] args) 
    {
        MyFrame9 f = new MyFrame9();
        f.setSize(500, 500);
        f.setVisible(true);
    }

}