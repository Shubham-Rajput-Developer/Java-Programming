
import java.util.Scanner;

public class ArrayPassingAsArgument {
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]+=1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size : ");
        int arraySize = sc.nextInt();
        int arr[] = new int[arraySize];
        System.out.println("Enter array Element : ");
        for(int i=0;i<arraySize;i++){
            arr[i]=sc.nextInt();
        }
        update(arr);
        System.out.println("Array after called function is : ");
        for(int i=0;i<arraySize;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Array size is : "+arr.length);
        sc.close();
    }
}
