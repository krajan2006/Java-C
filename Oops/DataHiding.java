//for hiding data private access modifier used
//to set values and get value seyyer and getter method used
//also using getter and setter we can restrict input

package Oops;

class rectangle
{
    private double length;
    private double breadth;

    public void setLength(double l) 
    {
        if(l>=0)
        {
            length = l;
        }
        else
        {
            length = 0;
        }
    }
    public double getLength() 
    {
        return length;
    }
    public void setBreadth(double b) 
    {
        if(b>=0)
        {
            breadth = b;
        }
        else
        {
            breadth = 0;
        }
    }
    public double getBreadth() 
    {
        return breadth;
    }

    public boolean isSquare()
    {
        if(length==breadth)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public double area()
    {
        return length*breadth;
        //or
        //return getLength()*getBreadth();
    }

    public double perimeter()
    {
        return 2*(length+breadth);
        //or
        //return 2*(getLength()+getBreadth());
    }
}

public class DataHiding 
{
    public static void main(String[] args) 
    {
        rectangle r=new rectangle();
        r.setLength(-10);
        r.setBreadth(10);

        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        System.out.println(r.isSquare());
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}