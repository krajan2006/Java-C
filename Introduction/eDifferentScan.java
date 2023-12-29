package Introduction;

import java.util.Scanner;

public class eDifferentScan 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        boolean num;
        System.out.println("Enter a boolean");
        num=sc.nextBoolean();

        byte num0;
        System.out.println("Enter a byte");
        num0=sc.nextByte();

        short num1;
        System.out.println("Enter a short");
        num1=sc.nextShort();

        int num2;
        System.out.println("Enter a integer");
        num2=sc.nextInt();

        long num3;
        System.out.println("Enter a long");
        num3=sc.nextLong();

        float  num4;
        System.out.println("Enter a float");
        num4=sc.nextFloat();

        double num5;
        System.out.println("Enter a double");
        num5=sc.nextDouble();

        String str1;
        System.out.println("Enter a word");
        str1=sc.next();

        // String str2;
        // System.out.println("Enter a line");
        // str2=sc.nextLine();

        System.out.println("1. "+num);
        System.out.println("2. "+num0);
        System.out.println("3. "+num1);
        System.out.println("4. "+num2);
        System.out.println("5. "+num3);
        System.out.println("6. "+num4);
        System.out.println("7. "+num5);
        System.out.println("8. "+str1);
        // System.out.println("9. "+str2);

        sc.close();

    }
}
