import java.util.*;
public class Counting_sort  //Time Complexity is O(n+range)
{
    public static void Counting(int arr[])
    {
        //Finding largest element in array
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest = Math.max(largest, arr[i]);
        }

        //Creating counting sort
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        System.out.println("Counting Array is : ");
        for(int i=0;i<count.length;i++)
        {
            System.out.print(count[i]+" ");
        }
        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j] = i;
                j++;
                count[i]--; 
            }
        }
    }
    public static void PrintArray(int arr[])
    {
        System.out.println("\nSorted Array Element is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        Counting(arr);
        PrintArray(arr);
    }
}
