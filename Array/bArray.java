package Array;

public class bArray 
{
    public static void main(String[] args) 
    {
        int[] num=new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;

        System.out.print("Using for_i loop");
        for(int i=0;i<num.length;i++)
        {
            System.out.print("\t"+num[i]);
        }

        System.out.println();
        System.out.print("Using for_each loop");
        for(int i: num)
        {
            System.out.print("\t"+i);
        }
    }
}
