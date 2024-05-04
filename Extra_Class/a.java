package Extra_Class;
//Class and Object

class Calculator
{
    //class contain variables
    int length;
    int width;

    //class contains methods
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
    public int mul(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}

public class a 
{
    public static void main(String[] args) 
    {
        int num1=4;
        int num2=6;

        Calculator cal;         //creating referance
        cal=new Calculator();   //creating object

        int result=cal.add(num1, num2);
        System.out.println(result);
    }
}
