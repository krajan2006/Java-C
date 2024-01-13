//passing integer as parameter --> actual parameter will not change
//call by value
package Method;

public class PassingParameter2 
{
    public static void replace(int previuos,int latest)
    {
        previuos=latest;
    }

    public static void main(String[] args) 
    {
        int x=10;
        int y=89;
        replace(x, y);
        System.out.println(x);

    }
}
