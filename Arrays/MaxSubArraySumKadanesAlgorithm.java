public class MaxSubArraySumKadanesAlgorithm {
    public static void MaxSubArraySum(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int small = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum = currentSum+arr[i];
            if(small<currentSum){
                small=currentSum;
            }
            System.out.println("Current Sum is : "+currentSum);
            if(currentSum<0){
                currentSum=0;
            }
            if(maxSum<currentSum){
                maxSum = currentSum;
            }
        }
        if(small<maxSum){
            System.out.println("Max sub Array sum is : "+small);
        }
        else{
            System.out.println("Max sub Array sum is : "+maxSum);
        }
    }
    public static void main(String args[]){
        int arr[] = {-2,3,-4,-4,2,-4,9,3};
        MaxSubArraySum(arr);
    }
}

