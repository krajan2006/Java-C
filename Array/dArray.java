package Array;

import java.util.Scanner;

public class dArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int[3][3];

        System.out.println("Enter Matrix Elements:");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix is given by: ");
        for(int[] i:matrix)
        {
            for(int j:i)
            {
                System.out.print(j+"   ");
            }
            System.out.println();
        }
        sc.close();
    }
}
