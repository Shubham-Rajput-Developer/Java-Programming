public class SearchRotatedArray {

    public static int search(int arr[],int tar, int si, int ei){
        if(si>ei){
            return -1;
        }
        //find mid
        int mid = (si+ei)/2;//si + (ei-si)/2 ;//(si+ei)/2;

        //case Found
        if(arr[mid]==tar){
            return mid;
        }

        //case mid on L1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar  && tar<= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            else{
                return search(arr, tar, mid+1, ei);
            }
        }

        //case mid on L2
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2,3};
        int target = 0;
        int targetIdx = search(arr, target, 0, arr.length-1);
        System.out.println(targetIdx);
    }   
}
