//Flowlayout
package AWT;

import java.awt.*;

class MyFrame8 extends Frame 
{
    Button b1, b2, b3, b4, b5, b6;

    public MyFrame8() 
    {
        super("FlowLayout Demo");

        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT);
        fl.setHgap(30);
        setLayout(fl);

        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}

public class iLayoutManagers1 
{
    public static void main(String[] args) 
    {
        MyFrame8 f = new MyFrame8();
        f.setSize(500, 500);
        f.setVisible(true);
    }

}