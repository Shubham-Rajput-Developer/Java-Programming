import java.util.Scanner;
public class Selection_sort {
    public static void Selectionsort(int Array[])
    {
        for(int i=0;i<Array.length-1;i++)
        {
            int poss = i;
            for(int j=i+1;j<Array.length;j++)
            {
                if(Array[poss]>Array[j])
                {
                    poss = j;
                }
            }
            int temp = Array[i];
            Array[i] = Array[poss];
            Array[poss] = temp;
        }
    }
    public static void reverseSelectionSort(int Array[])
    {
        for(int i=0;i<Array.length-1;i++)
        {
            int poss = i;
            for(int j=i+1;j<Array.length;j++)
            {
                if(Array[j]>Array[poss])
                {
                    poss = j;
                }
            }
            int temp = Array[i];
            Array[i] = Array[poss];
            Array[poss] = temp;
        }
    }
    public static void PrintArray(int Array[])
    {
        System.out.println("Sorted Array is : ");
        for(int i=0;i<Array.length;i++)
        {
            System.out.print(Array[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array : ");
        int n = sc.nextInt();
        int Array[]=new int[n];
        System.out.println("Enter Array Element : ");
        for(int i=0;i<n;i++)
        {
            Array[i] = sc.nextInt();
        }
        //Selectionsort(Array);
        reverseSelectionSort(Array);
        PrintArray(Array);
        sc.close();
    }
}
