package Oops;

import java.util.Scanner;

class student
{
    public String name;
    public String course_name;
    public int roll_no;
    public int no_of_subject;
    public int[] marks=new int[100];;

    public int total_marks()
    {
        int sum=0;
        for (int i = 0; i < no_of_subject; i++) 
        {
            sum+=marks[i];
        }
        return sum;
    }

    public double Percentage()
    {
        return (double)total_marks()/no_of_subject;
    }

    public String grade()
    {
        if(Percentage()>=90&&Percentage()<=100)
        {
            return "A1";
        }
        else if(Percentage()>=80)
        { 
            return "A2";
        }
        else if(Percentage()>=70)
        { 
            return "B";
        }
        else if(Percentage()>=60)
        { 
            return "C";
        }
        else if(Percentage()>=50)
        { 
            return "D";
        }
        else if(Percentage()>=40)
        { 
            return "E";
        }
        else
        {
            return "Fail";
        }
    }
    public void getdetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student name");
        name=sc.nextLine();
        System.out.println("Enter Course name");
        course_name=sc.nextLine();
        System.out.println("Enter Roll number");
        roll_no=sc.nextInt();
        System.out.println("Enter number of subject");
        no_of_subject=sc.nextInt();
        for (int i = 0; i< no_of_subject; i++) 
        {
            System.out.printf("Enter marks of subject %d\n",i+1);
            marks[i]=sc.nextInt();
        }
        sc.close();
    }
    public String details()
    {
        return 
        "----------------------"+
        "\nName:"+name+
        "\nCourse:"+course_name+
        "\nRoll No:"+roll_no+
        "\nToatal Marks:"+total_marks()+
        "\nPercentage:"+Percentage()+
        "\nGrade:"+grade();
    }
}

public class ExampleClass2 
{
    public static void main(String[] args) 
    {
        student s=new student();
        s.getdetails();
        System.out.println(s.details());
    }
}
