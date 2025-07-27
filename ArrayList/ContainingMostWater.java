import java.util.ArrayList;
public class ContainingMostWater {
    public static int trapped(ArrayList<Integer> heights){
        int max = 0;
        for(int i=0;i<heights.size();i++){
            for(int j=i+1;j<heights.size();j++){
                int height = Math.min(heights.get(i),heights.get(j));
                int width = j-i;
                int water = height*width;
                if(water>max){
                    max = water;
                }
            }
        }
        return max;
    }

    public static int OptimizedTrapped(ArrayList<Integer> heights){
        int left = 0;
        int right = heights.size()-1;
        int max = 0;
        while(left<right){
            int height = Math.min(heights.get(left),heights.get(right));
            int width = right-left;
            int water = height*width;
            max = Math.max(water,max);
            if(heights.get(left)<heights.get(height)){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
    public static void main(String args[]){
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);
        heights.add(1);

        System.out.println(OptimizedTrapped(heights));
        
    }       
}
