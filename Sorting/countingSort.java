public class countingSort {
    public static void Sort(int arr[]){
        //find largest
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        //counting array
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //place element by decresing count from counting array
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] =  i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,1,5,2,3,5,1,3,5};
        Sort(arr);
        System.out.println("Sorted array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
