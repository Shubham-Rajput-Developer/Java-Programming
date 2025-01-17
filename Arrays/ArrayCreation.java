package Arrays;

import java.util.Scanner;

public class ArrayCreation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //array creation
        int arr[] = new int[10];
        //Accepting array input
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //display array element
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nArray length is : "+arr.length);
        sc.close();
    }
}
