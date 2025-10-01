public class demo{
    public static int checkCount(int N, int A[]){
        int totalSum = 0;
        for(int num: A) totalSum+=num;
        int count = 0;
        int prefixSum = 0;
        for(int i=0;i<N-1;i++){
            prefixSum = totalSum - A[i];
            int sufixSum = totalSum-prefixSum;
            if(Math.abs(prefixSum-sufixSum)%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int A[] = {10,10,4};
        int N = 3;
        System.out.println(checkCount(N,A));
    }
}