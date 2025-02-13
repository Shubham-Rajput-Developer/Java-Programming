package Arrays2D;

public class numberof7s {
    public static int checks(int nums[][]){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[][] = {
            {4,5,7},
            {7,3,7}
        };
        System.out.println(checks(nums));
    }
}
