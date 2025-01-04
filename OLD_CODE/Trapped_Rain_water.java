import java.util.*;
public class Trapped_Rain_water
{
    public static int Trapped_water(int bar[])
    {

        //leftmax boundry array
        int leftmax[] = new int[bar.length];
        leftmax[0] = bar[0]; 
        for(int i=1;i<bar.length;i++)
        {
            leftmax[i] = Math.max(bar[i],leftmax[i-1]);
        }

        //right boundry array
        int rightmax[] = new int[bar.length];
        rightmax[bar.length-1] = bar[bar.length-1];
        for(int i=bar.length-2;i>=0;i--)
        {
            rightmax[i] = Math.max(bar[i],rightmax[i+1]);
        }

        int Trapped = 0;
        //loop for claculating water level and Add Trapping value
        for(int i=0;i<bar.length;i++)
        {
            int Waterlevel = Math.min(rightmax[i],leftmax[i]);
            Trapped += Waterlevel-bar[i];
        }
        return Trapped;
    }
    public static void main(String args[])
    {
        int bar[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped Water is : "+Trapped_water(bar));
    }
}