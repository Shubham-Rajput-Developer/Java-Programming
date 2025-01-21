public class MaxSubArraySumBruteForce {
    public static void MaxSubArraySum(int arr[]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currentSum = 0;
                for(int k=i;k<=j;k++){
                    currentSum += arr[k];
                }
                System.out.println("current Sum : "+currentSum);
                if(max<currentSum){
                    max=currentSum;
                }
            }
        }
        System.out.println("Max sum of Subarray is : "+max);
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,5,9,8};
        MaxSubArraySum(arr);
    }
}
