package Static_Final_SingletonClass;

public class StaticBlock1 
{
    static 
    {
        System.out.println("Block 1");
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Main");
    }

    static
    {
        System.out.println("Block 2");
    }
}
