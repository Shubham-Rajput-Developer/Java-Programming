import java.util.ArrayList;

public class PairSum2 {
    public static boolean checkSum(ArrayList<Integer> list,int target){
        int left=0;
        int right=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                left=i+1;
                right=i;
                break;
            }
        }

        while(left!=right){
            if(list.get(left)+list.get(right)==target){
                return true;
            }
            else if(list.get(left)+list.get(right)>target){
                right = (list.size()+right-1)%list.size();
            }
            else if(list.get(left)+list.get(right)<target){
                left = (left+1)%list.size();
            }
        }
        return false;
    }
    public static void main(String agrs[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(checkSum(list,29));
    }
}
