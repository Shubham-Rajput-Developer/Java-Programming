import java.util.Stack;

public class HeightInHistogram {
    public static void maximumArea(int heights[]){
        int maxArea = 0;
        int NextSRight[] = new int[heights.length];
        int NextSLeft[] = new int[heights.length];
        
        //NextSmaller Right
        Stack<Integer> s1 = new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!s1.isEmpty() && heights[s1.peek()] >=heights[i]){
                s1.pop(); 
            }
            if(s1.isEmpty()){
                NextSRight[i]=heights.length;
            }else{
                NextSRight[i]=s1.peek(); 
            }
            s1.push(i);
        }

        //NextSmaller Left
        s1 = new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!s1.isEmpty() && heights[s1.peek()] >=heights[i]){
                s1.pop(); 
            }
            if(s1.isEmpty()){
                NextSLeft[i]=-1;
            }else{
                NextSLeft[i]=s1.peek(); 
            }
            s1.push(i);
        }

        //Curr Area
        for(int i=0;i<heights.length;i++){
            int height = heights[i];
            int width = NextSRight[i]-NextSLeft[i]-1;
            int currArea = height*width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println(maxArea);
    }
    public static void main(String args[]){
        int heights[] = {2,1,5,6,2,3};
        maximumArea(heights);
    }
}
