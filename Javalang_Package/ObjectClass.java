package Javalang_Package;

//import java.lang.*;//default imported class

class MyObject
{
    @Override
    public String toString()
    {
        return "My Object";
    }
    @Override
    public int hashCode()
    {
        return 100;
    }
    @Override
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
}

public class ObjectClass 
{
    public static void main(String[] args) 
    {
        Object o=new Object();
        System.out.println(o);

        MyObject o1=new MyObject();
        System.out.println(o1);

        MyObject o2=new MyObject();
        System.out.println(o1.equals(o2));
        //gives true when equals method override
    }
}
