import java.util.Scanner;
public class Bubble_Sort {
    public static void Bubblesort(int Array[])
    {
        for(int i=1;i<Array.length;i++)
        {
            for(int j=0;j<Array.length-i;j++)
            {
                if(Array[j]>Array[j+1])
                {
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
        }
    }
    public static void reverseBubblesort(int Array[])
    {
        for(int i=1;i<Array.length;i++)
        {
            for(int j=0;j<Array.length-i;j++)
            {
                if(Array[j]<Array[j+1])
                {
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
        }
    }
    public static void PrintArray(int Array[])
    {
        System.out.println("Sorted Array Element is : ");
        for(int i=0;i<Array.length;i++)
        {
            System.out.print(Array[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Accepting Length of Array
        System.out.print("Enter Length of array : ");
        int n = sc.nextInt();
        int Array[] = new int[n];//Declaring array
        //Accepting Array Element form user 
        System.out.println("Enter Integer Array Element : ");
        for(int i=0;i<n;i++)
        {
            Array[i] = sc.nextInt();
        }
        //Calling Bubble Sort Function
        //Bubblesort(Array);
        //Calling Reverse Bubble Sort Funtion
        reverseBubblesort(Array);
        //Print Sorted Array 
        PrintArray(Array);
    }
    
}
 