//GridLayout
package AWT;

import java.awt.*;

class MyFrame10 extends Frame 
{
    Button b1, b2, b3, b4, b5, b6,b7;

    public MyFrame10() 
    {
        super("GridLayout Demo");

        setLayout(new GridLayout(3, 3));

        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");
        b7 = new Button("seven");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b6);
        add(b7);
    }
}

public class iLayoutManagers3 
{
    public static void main(String[] args) 
    {
        MyFrame10 f = new MyFrame10();
        f.setSize(500, 500);
        f.setVisible(true);
    }

}