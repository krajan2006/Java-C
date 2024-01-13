package Inheritance;

class SUPER
{
    public void display()
    {
        System.out.println("SUPER Display");
    }
}

class SUB extends SUPER
{
    public void display()
    {
        System.out.println("SUB Display");
    }
}

public class Overriding
{
    public static void main(String[] args) 
    {
        SUPER s=new SUB();
        s.display();
          
    }    
}