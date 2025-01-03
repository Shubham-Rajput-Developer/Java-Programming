// Given an integer array nums, return all the triplets 
// [nums[i], nums[j],  nums[k]] such that i != j, i != k,
//  and j != k, and nums[i] + nums[j] + nums[k] == 0.
import java.util.*;
public class Triplate_sum_zero {
    public static void Triplate(int number[])
    {
        for(int i=0;i<number.length;i++)
        {
            for(int j=i+1;j<number.length;j++)
            {
                for(int k=j=1;j<number.length;j++)
                {
                    if(number[i]+number[j]+number[k]==0)
                    {
                        System.out.println(number[i]+" "+number[j]+" "+number[k]);
                    }
                }
            }
        }
    }
    public static void main(String args[])
    {
        int number[] = {-1,1,0,2,1,-1};
        Triplate(number);
    }
}
