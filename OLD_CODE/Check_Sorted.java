public class Check_Sorted {
    public static boolean check(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return check(arr, i+1);
        
    }
 public static void main(String args[])
 {
    int arr[] = {1};
    System.out.println(check(arr,0));
 }   
}
