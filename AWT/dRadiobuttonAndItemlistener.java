package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame3 extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;                                      //change

    public MyFrame3()
    {
        super("RadioButton Demo");

        setLayout(new FlowLayout());

        l= new Label("Nothing is selected");
        cbg= new CheckboxGroup();                           //change
        c1=new Checkbox("Java",false,cbg);      //change
        c2=new Checkbox("Python",false,cbg);    //change
        c3=new Checkbox("C#",false,cbg);        //change

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

public class dRadiobuttonAndItemlistener 
{
    public static void main(String[] args) 
    {
        MyFrame3 f = new MyFrame3();
        f.setVisible(true);
        f.setSize(400,400);

    }
}