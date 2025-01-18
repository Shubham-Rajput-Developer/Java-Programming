
public class FindLaregest {
    public static void Find(int arr[]){
        int large = arr[0];
        for(int i=1;i<arr.length;i++){
            if(large<arr[i]){
                large = arr[i];
            }
        }
        System.out.println("Largest number in Array is : "+large);
    }
    public static void main(String args[]){
        int arr[] = {1,3,2,4,0,32,22,44,34,19,10,92};
        Find(arr);
    }
}
