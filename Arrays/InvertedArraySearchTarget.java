/*
 There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For
example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and
become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the
index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
 */

public class InvertedArraySearchTarget {
    public static int InvertedSearch(int nums[], int target){
        //Find pivot element postion for making two part of array
        int min = minSearch(nums);
        
        //check in right part of array
        if(target>=nums[min] && nums[nums.length-1]>=target){
            return Search(target,nums,min,nums.length-1);
        }
        else{
            return Search(target,nums,0,min);
        }
    }
    public static int minSearch(int nums[]){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = ((start+end)/2);
            if(nums[mid]<nums[mid-1] && mid>0){
                return mid;
            }
            else if(nums[start]<=nums[mid] && nums[end]<nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
    public static int Search(int target,int nums[],int start,int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {6,7,8,9,1,2,3,4};
        int target = 3;
        int pos = InvertedSearch(nums,target);
        System.out.println("target found at position : "+pos);
    }
}
