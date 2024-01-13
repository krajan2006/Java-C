package Static_Final_SingletonClass;

final class Test1
{
    public void show()
    {
        System.out.println("Hello");
    }
}
//can not inheritence final class
// class Test2 extends Test1
// {
//     public void show()
//     {
//         System.out.println("Hello,Welcome");
//     }    
// }

public class FinalDemo 
{
    static final float HI=2.3456f;
    public static void main(String[] args) 
    {
        final float PI=3.14159f;
        System.out.println(PI);
        System.out.println(HI);
    }
}
