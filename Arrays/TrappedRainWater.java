public class TrappedRainWater {
    public static void CalculateTrappedWater(int heightArray[]){
        int n = heightArray.length;
        //Calculate LeftMax boundary
        int leftMax[] = new int[n];
        leftMax[0] = heightArray[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(heightArray[i], leftMax[i-1]);
        }

        //Calculate RightMax boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = heightArray[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(heightArray[i], rightMax[i+1]);
        }

        //Calculate Trapped Rain water - calculating water level and then trapped water = waterlevel-height
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterlevel-heightArray[i];
        }
        System.out.println("Trapped water is : "+trappedWater);
    }
    public static void main(String args[]){
        int heightArray[] = {4,2,0,6,3,2,5};
        CalculateTrappedWater(heightArray);
    }
}
