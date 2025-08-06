import java.util.Arrays;
import java.util.Stack;

public class NectGreaterII {
    public static void main(String args[]){
        int arr[] = {2,1,2,3,1};
        int n = arr.length;
        int nextGreater[] = new int[n];
        Arrays.fill(nextGreater,-1);
        Stack<Integer> s = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int idx = i%n;
            while(!s.isEmpty() && arr[s.peek()]<=arr[idx]){
                s.pop();
            }
            if(!s.isEmpty()){
                nextGreater[idx] = arr[s.peek()];
            }
            s.push(idx);
        }

        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}
