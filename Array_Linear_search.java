import java.util.Scanner;
public class Array_Linear_search {
    public static int Linear_search(int numbers[], int key)
    {
        //here time complexity is O(n) because of our loop run at n times.
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {10,20,30,40,45,50,60,70,80,90};
        System.out.print("Enter Key element : ");
        int key  = sc.nextInt();
        int index = Linear_search(numbers,key);
        
        if(index==-1)
        {
            System.out.println("Key element not found...");
        }
        else
        {
            System.out.println("Key Element is Found at index : "+index);
        }
        sc.close();
    }
}
