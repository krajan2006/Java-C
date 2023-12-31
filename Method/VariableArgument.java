package Method;

public class VariableArgument 
{
    static void add(int...arr)
    {
        int add=0;
        for(int a:arr)
        {
            add+=a;
        }
        System.err.println(add);
    }
    public static void main(String[] args) 
    {
        add(10,15,25);
    }
}
