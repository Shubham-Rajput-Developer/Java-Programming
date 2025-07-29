import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumber {
    public static ArrayList<Integer> findLonelyNumber(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> result = new ArrayList<>();

        int len = nums.size();
        for(int i=0;i<len;i++){
          if( i!=0 && (nums.get(i-1) == nums.get(i)-1 || nums.get(i-1)==nums.get(i))){
                continue;
          }

          if(i!=len-1 && (nums.get(i+1) == nums.get(i)+1 || nums.get(i+1)==nums.get(i))){
            continue;
          }
          
          result.add(nums.get(i));
        }
        return result;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(4);
        //nums.add(11);


        System.out.println(findLonelyNumber(nums));
    }
}
