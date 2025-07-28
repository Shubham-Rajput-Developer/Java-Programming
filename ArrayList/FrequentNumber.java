import java.util.ArrayList;

public class FrequentNumber {
    public static int countFrequntNumber(ArrayList<Integer> nums,int key){
        int arr[] = new int[1000];
        
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)==key){
                arr[nums.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0;i<1000;i++){
            if(arr[i]>max){
                max = arr[i];
                ans = i+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);

        System.out.println(countFrequntNumber(nums,1));
    }
}
