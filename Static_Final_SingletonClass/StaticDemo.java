package Static_Final_SingletonClass;

class Test
{
    static int x=10;
    int y=20;

    void show()
    {
        System.out.println(x+" "+y);
    }

    static void display()
    {
        System.out.println(x);
    }
}

public class StaticDemo 
{
    public static void main(String[] args) 
    {
        Test t1 = new Test();
        t1.show();
        //t1.x=30;//it will chage value of x for both t1 and t2 object
        t1.y=50;

        Test t2 = new Test();
        t2.show();
    }
}
