package Introduction;

public class cFormatPrint 
{  
    public static void main(String[] args) 
    {    
        double x=12.345;
        
        System.out.printf("%f\n",x);
        //simple format print

        System.out.printf("%.2f\n",x);
        //two digit after decimal

        System.out.printf("%10f\n",x);
        //take 10 digit space and print from right

        System.out.printf("%10.0f\n",x);
        //take 10 digit space and print from right and gives integer

        System.out.printf("%10.2f\n",x);
        //take 10 digit space and print from right and 2 digit after decimal

        System.out.printf("%-10f\n",x); 
        //take 10 digit space and print from left

        System.out.printf("%-10.0f\n",x);
        //take 10 digit space and print from left and gives integer

        System.out.printf("%-10.2f",x);
        //take 10 digit space and print from left and 2 digit after decimal
    
    }  
}  