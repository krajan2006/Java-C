package String;

/*
Write a Java program to fill in a letter template which looks like below:
letter = “Dear <|name|>, Thanks a lot”
Replace <|name|> with a string (some name)
*/

public class Question3 
{
    public static void main(String[] args) 
    {
        String s="Dear Kajal, Thanks a lot!";
        s=s.replace("Kajal","Rajan");
        System.out.println(s);
    }
}
