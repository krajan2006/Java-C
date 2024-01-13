package Method;

public class ExampleMethod1 
{
    public static int max(int x, int y)//x & y are formal parameter
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
    public static void main(String[] args) 
    {
        int a=100;
        int b=109;
        int c;
        c=max(a,b);//a & b are actual parameter
        System.out.println(c);
    }
}