package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        int arr[] = {1,3,2,4,0,32,22,44,34,19,10};
        int index = search(arr,key);
        if(index==-1){
            System.out.println("Key not found!!");
        }
        else{
            System.out.println("Key found at index "+index);
        }
        sc.close();
    }
}
