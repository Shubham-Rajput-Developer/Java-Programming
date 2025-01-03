public class First_occurance {
    public static int occuredAt(int arr[], int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(key == arr[i])
        {
            return i;
        }
       
        return occuredAt(arr, key, i+1);
    }
    public static void main(String args[])
    {
        int arr[] = {2,3,4,6,7,3,4,9};
        int key = 5;
        System.out.println(occuredAt(arr,key,0));

    }
}
