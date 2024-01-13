//passing object as parameter --> actual parameter will change
//call by reference
package Method;

public class PassingParameter1 
{
    public static void replace(int[]arr,int index,int latest)
    {
        arr[index]=latest;
    }

    public static void main(String[] args) 
    {
        int[] array={10,23,56,78,98,34,71};
        replace(array,1,100);
        
        for(int i:array)
        {
            System.out.println(i);
        }
    }
}
