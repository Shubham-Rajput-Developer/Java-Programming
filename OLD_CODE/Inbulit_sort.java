import java.util.Arrays;
import java.util.Collections;
public class Inbulit_sort {
    public static void PrintArray(Integer arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        //int arr[] = {4,1,3,5,2};
        //Arrays.sort(arr);
        Integer arr[] = {102,303,42,34,45,90};
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        PrintArray(arr);
    }
}
