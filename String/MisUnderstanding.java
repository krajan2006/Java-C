package String;

public class MisUnderstanding 
{
    public static void main(String[] args) 
    {
        //concept-1
        String s1="Rajan";
        String s2=" Kushwah";
        String s3=s1+s2;
        System.out.println(s3);

        //concept-2
        String s4="Hello";
        String s5="Hello";
        System.out.println(s4==s5);
        
        /*in stack two different s4 and s5 object 
        are created but having same address 
        it referes memory allocation in heap*/

    }
}
