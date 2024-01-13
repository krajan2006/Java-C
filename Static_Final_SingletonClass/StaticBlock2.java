package Static_Final_SingletonClass;

class my
{
    static 
    {
        System.out.println("Block 1");
    }
    
    static
    {
        System.out.println("Block 2");
    }

}

public class StaticBlock2 
{
    public static void main(String[] args) 
    {
        System.out.println("Main");
        //my m=new my();
    }
}
