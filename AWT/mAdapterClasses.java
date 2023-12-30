package AWT;
import java.awt.*;
import java.awt.event.*;

 //Outer class for handling Window Event

/*
class MyWindowAdapter extends WindowAdapter    
{
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
}
*/

class MyFrame16 extends Frame
{
    MyFrame16()
    {
        super("AdapterClass Demo");

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        
     // use this for handling event using inner class
     //   addWindowLister(new MyWindowAdapter());
    }    

 // Inner class used for handling event

   /*
    class MyWindowAdapter extends WindowAdapter    
    {
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
    }
    */
}

public class mAdapterClasses 
{  
    public static void main(String[] args) 
    {
        MyFrame16 f=new MyFrame16();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}