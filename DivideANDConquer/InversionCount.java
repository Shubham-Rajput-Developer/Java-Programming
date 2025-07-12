public class InversionCount {
    public static int getInvCount(int arr[]){
        int invCount = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    invCount++;
                }
            }
        }
        return invCount;
    }

    public static int merge(int arr[],int left, int mid, int right){
        int i=left, j=mid, k=0;
        int invCount = 0;
        int temp[] = new int[(right-left)+1];
        while((i<mid) && (j<=right)){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr[j];
                invCount += (mid-i);
                k++;
                j++;
            }
        }
        while(i<mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=right){
            temp[k]=arr[j];
            k++;
            j++;
        }

        for(i=left,k=0; i<=right; i++,k++){
            arr[i] = temp[k];
        }
        return invCount;
    }
    public static int mergeSort(int arr[],int left, int right){
        int invCount = 0;
        if(right>left){
            int mid = (right+left)/2;
            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid+1, right);
            invCount += merge(arr, left, mid+1, right);
        }
        return invCount;
    }
    public static int getInversionCount(int arr[]){
        return mergeSort(arr,0,arr.length-1);
    }
    public static void main(String args[]){
        int arr[] = {1,20,6,4,5};
        System.out.println("Inversion count is : "+getInversionCount(arr));
    }
}
