package Multithreading__;

class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}

class MyRunnable implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class MTUsingThreadClass //extends Thread
{
    /*public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }*/
    
    public static void main(String[] args) {
        
        MyThread th=new MyThread();
        th.start();
        //MTUsingThreadClass t=new MTUsingThreadClass();
        //t.start();
        
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
        }
        
    }
    
}