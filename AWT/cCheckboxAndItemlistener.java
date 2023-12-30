package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame2 extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;

    public MyFrame2()
    {
        super("CheckBox Demo");

        setLayout(new FlowLayout());

        l= new Label("Nothing is selected");
        c1=new Checkbox("Java");
        c2=new Checkbox("Python");
        c3=new Checkbox("C#");

        add(l);
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
       String str="";

       if(c1.getState())
       {
        str=str+" "+c1.getLabel();
       }
       if(c2.getState())
       {
        str=str+" "+c2.getLabel();
       }
       if(c3.getState())
       {
        str=str+" "+c3.getLabel();
       }
       if(str.isEmpty())
       {
        str="Nothing is selected";
       }
       l.setText(str);
    }
}

public class cCheckboxAndItemlistener 
{
    public static void main(String[] args) 
    {
        MyFrame2 f = new MyFrame2();
        f.setVisible(true);
        f.setSize(400,400);

    }
}
