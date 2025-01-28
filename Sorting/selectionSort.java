public class selectionSort {
    public static void Sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int poss = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[poss]>arr[j]){
                    poss = j;
                }
            }
            int temp = arr[poss];
            arr[poss] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {2,5,3,7,1,8,4};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
