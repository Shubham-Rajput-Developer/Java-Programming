public class MaxSubArraySumPrefixArray {
    public static void MaxSubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.println("Prefix array is : ");
        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currentSum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                System.out.println("\nCurrent Sum is : "+currentSum);
                if(maxSum<currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("\nMaximum sum is : "+maxSum);
    }
    public static void main(String args[]){
        int arr[] = {2,-3,-5,6,-8,3};
        MaxSubArraySum(arr);
    }
}
