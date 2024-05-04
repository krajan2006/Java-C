package String;
import java.util.Scanner;

/*Write a Java program to convert a string to lowercase*/
public class Question1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();

        s=s.toLowerCase();

        System.out.println("Converted to lower case:");
        System.out.println(s);
        sc.close();
    }
}
