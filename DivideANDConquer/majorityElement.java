public class majorityElement {
    // public static int findMajorityElement1(int arr[]){
    //     int majorCount = arr.length/2;
    //     for(int i=0;i<arr.length;i++){
    //         int count = 0;
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count>majorCount){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }

    public static int countRange(int nums[], int num,int si, int ei){
        int count = 0;
        for(int i=si;i<=ei;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }

    public static int findMajorityElement2(int arr[],int si,int ei){
        if(si==ei){
            return arr[si];
        }
        
        int mid = si+(ei-si)/2;
        int left = findMajorityElement2(arr, si, mid);
        int right = findMajorityElement2(arr, mid+1, ei);

        if(right==left){
            return left;
        }

        int leftCount = countRange(arr,left,si,ei);
        int rightCount = countRange(arr,right,si,ei);

        return leftCount>rightCount ? left:right;
        
    }
    public static void main(String args[]){
        int arr[] = {1,2,2,1,3,3,3,3,2,2,4};
        int item = findMajorityElement2(arr,0,arr.length-1);
        System.out.println(item);
    }      
}
