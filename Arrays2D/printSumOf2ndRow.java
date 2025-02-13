package Arrays2D;

public class printSumOf2ndRow {
    public static int printSum(int nums[][]){
        int sum = 0;
        for(int i=0;i<nums[0].length;i++){
            sum += nums[1][i];
        }
        return sum;
    }
    public static void main(String args[]){
        int nums[][] = {
            {3,5,6,8},
            {11,4,3,5},
            {6,4,8,12}
        };
        System.out.println(printSum(nums));
    }
}
