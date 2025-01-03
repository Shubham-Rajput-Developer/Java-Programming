import java.util.*;
public class Insertion_sort
{
   public static void Insertionsort(int Array[])
   {
    for(int i=1;i<Array.length;i++)
    {
        int  curr = Array[i];
        int prev = i-1;
        //Finding Currect Position 
        while(prev>=0 && Array[prev]>curr)
        {
            Array[prev+1]=Array[prev];
            prev--;
        }
        //Inserting
        Array[prev+1] = curr;
    }
   }

   public static void ReverseInsertionsort(int Array[])
   {
    
        for(int i=1;i<Array.length;i++)
        {
            int curr = Array[i];
            int prev = i-1;
            while(prev>=0 && Array[prev]<curr )
            {
                Array[prev+1] = Array[prev];
                prev--;
            }
            Array[prev+1] = curr;
        }
   }
    public static void PrintArray(int Array[])
    {
        
        System.out.println("Array Element is : ");
        for(int i=0;i<Array.length;i++)
        {
            System.out.print(Array[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Aarray : ");
        int n = sc.nextInt();
        int Array[] = new int[n];
        System.out.println("Enter Array Element : ");
        for(int i=0 ; i<n; i++)
        {
            Array[i] = sc.nextInt();
        }
        //Insertionsort(Array);
        ReverseInsertionsort(Array);
        PrintArray(Array);
    }
}