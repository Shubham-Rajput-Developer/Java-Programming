import java.util.*;
public class JavaArrays {
    public static void update(int arrr[])
    {
        for(int i=0;i<arrr.length;i++)
        {
            arrr[i] = arrr[i]+1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // int marks[] = new int[100];
        // System.out.println("Enter Array Element : ");
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("Physics : "+marks[0]);
        // System.out.println("Math : "+marks[1]);
        // System.out.println("OOP : "+marks[2]);
        // System.out.println("Length of Array is : "+marks.length);

        int arrr[] = {10,20,30,40,50};
        System.out.println("Before Update array");
        for(int i=0;i<arrr.length;i++)
        {
            System.out.print(arrr[i]+" ");
        }
        update(arrr);
        System.out.println("\nAfter Update array");
        for(int i=0;i<arrr.length;i++)
        {
            System.out.print(arrr[i]+" ");
        }
    }
    
}
