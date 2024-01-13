package Method;

class maximum
{
    public int max(int x, int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
}

public class ExampleMethod3 
{
    public static void main(String[] args) 
    {
        maximum m=new maximum();
        int a=m.max(18,34);
        System.out.println(a);
    }
}
