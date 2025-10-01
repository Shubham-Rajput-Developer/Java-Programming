package GreedyAlgorithm;

import java.util.Arrays;

public class MinAbsoluteDifference {
    public static void main(String args[]){
        int A[] = {1,2,6,3};
        int B[] = {2,1,3,8};
        
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println(minDiff);
    }
}
