package Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static int Search(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else{
                if(key>arr[mid]){
                    start = mid+1;
                }
                else{
                    end =mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String ARGS[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to be Search : ");
        int key = sc.nextInt();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int index = Search(arr,key);
        if(index==-1){
            System.out.println("key not found!!");
        }
        else{
            System.out.println("Key found at location "+index);
        }
        sc.close();
        
    }
}
