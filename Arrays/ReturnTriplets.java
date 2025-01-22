/*
 Given an integer array nums, return all the triplets [nums[i], nums[j],
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
 */
public class ReturnTriplets {
    public static void Triplets(int nums[]){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        System.out.println("Triplts is : "+nums[i]+","+nums[j]+","+nums[k]);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {-2,3,2,-5,4,-3};
        Triplets(nums);
    }
}
