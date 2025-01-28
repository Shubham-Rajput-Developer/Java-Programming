import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String args[]){
        Integer arr[] = {3,7,4,8,2,5,0};
        
        //normal sorted array 
        Arrays.sort(arr); 
        System.out.println("Sorted Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //added starting index and ending index
        Arrays.sort(arr,0,4);
        System.out.println("\nFrom 0 to 3 : Sorted Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //Reverse sorted array
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("\nReverse Sorted Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
