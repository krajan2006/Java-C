package String;

import java.util.Scanner;

/*Write a Java program to replace spaces with underscores*/
public class Question2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.replace(' ','_');

        System.out.println("Replace spaces with underscores:");
        System.out.println(s);
        sc.close();
    }
}
