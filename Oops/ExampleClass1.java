package Oops;

class circle
{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    public double circumference()
    {
        return perimeter();
    }
}

public class ExampleClass1 
{
    public static void main(String[] args) 
    {
        circle c1=new circle();//creating object
        circle c2=new circle();

        c1.radius=7;
        c2.radius=14;

        System.out.println("Area of circle c1 "+c1.area());
        System.out.println("Perimeter of circle c1 "+c1.circumference());
        System.out.println("Circumference of circle c1 "+c1.perimeter());

        System.out.println("Area of circle c2 "+c2.area());
        System.out.println("Perimeter of circle c2 "+c2.circumference());
        System.out.println("Circumference of circle c2 "+c2.perimeter());
    }
}
