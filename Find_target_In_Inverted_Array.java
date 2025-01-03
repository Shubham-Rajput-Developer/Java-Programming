//Question : 
// There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
// index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],...,
// nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might
// be rotated at pivot index 3 and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation
// and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:Input:nums = [4, 5, 6, 7, 0, 1, 2], 
// target = 0 Output:   4 
import java.util.*;
public class Find_target_In_Inverted_Array {
    public static int invetred_array(int nums[],int target)
    {
        int min = minsearch(nums);
        System.out.println("Minimum value at index : "+min);
        if(nums[min]<=target && nums[nums.length-1]>=target)
        {
            return search(nums,min,nums.length-1,target);
        }
        else
        {
            return search(nums,0,min,target);
        }
    }

    public static int search(int nums[],int left, int right, int target)
    {
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return -1;
    }
    public static int minsearch(int nums[])
    {
        int left = 0;
        int right = nums.length-1;
        while(left<right)
        {
            int mid = left+(right-left)/2;
            if(nums[mid]>0 && nums[mid]<nums[mid-1])
            {
                return mid;
            }
            else if(nums[mid]>=nums[left] &&  nums[mid]>nums[right])
            {
                left = mid + 1;
            }
            else
            {
            right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String args[])
    {
        int nums[] = {50,60,70,80,90,10,20,30,40};
        int target = 20;
        System.out.println("Target placed at index : "+invetred_array(nums,target));
    }
}
