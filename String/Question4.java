package String;

/*Write a Java program to detect double and triple spaces in a string*/
public class Question4 
{
    public static void main(String[] args) 
    {
        String s="Hello, My  name is  Rajan    yoh   oho";
        System.out.println(s.indexOf("  "));
        System.out.println(s.indexOf("   "));
    }
}
