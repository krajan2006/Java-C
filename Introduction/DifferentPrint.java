package Introduction;

public class DifferentPrint 
{
    public static void main(String[] args) 
    {
        //printing string
        System.out.print("1.Rajan ");//next print in same line
        System.out.println("2.Rajan");//next print in next line

        //printing variable
        int x = 6;
        System.out.println(x);

        //printing string and variable
        System.out.println("4.Value of x is " + x);


        //formate printing
        int a = 6;
        float b = 5.6457f;
        System.out.printf("5.The value of a is %d and value of b is %f\n",a,b);
    }
}
