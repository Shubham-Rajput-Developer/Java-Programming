import java.util.*;
public class Array_Binary_Search {
    public static int Search(int number[],int key)
    {
        int start = 0;
        int end = (number.length)-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(number[mid]==key)
            {
                return mid;
            }
            else 
            {
                if(key>number[mid])
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number[] = {10,20,30,40,50,60,70,};
        System.out.print("Enter Key : ");
        int key = sc.nextInt();
        int index = Search(number,key);
        if(index==-1)
        {
            System.out.println("Key element is Not found");
        }
        else
        {
            System.out.println("Key element is found at "+index);
        }

    }
    
}
