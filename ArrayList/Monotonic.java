import java.util.ArrayList;

public class Monotonic {
    public static boolean checkMonotone(ArrayList<Integer> nums){
        boolean Incflag = true;
        boolean Decflag = true;
        for(int i=0;i<nums.size()-1;i++){
                if(nums.get(i)>=nums.get(i+1)){
                    Incflag = false;
                }else{
                    Decflag = false;
                }
        }
        
        return Incflag||Decflag;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(9);
        nums.add(5);
        nums.add(4);
        nums.add(3);
        System.out.println(checkMonotone(nums));
    }
}
