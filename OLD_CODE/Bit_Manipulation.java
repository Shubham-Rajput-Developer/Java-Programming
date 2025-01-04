import java.util.*;
public class Bit_Manipulation {
    //get ith element at ith position
    public static int getithelement(int num, int i)
    {
        int bitmax = 1<<i;
        if((num & bitmax) == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    //Set ith element means set 1 at ith position
    public static int setithelement(int num,int i)
    {
        int bitmax = 1<<i;
        return num | bitmax;
    }
    //Clear ith element means set 0 at ith position
    public static int clearithelement(int num,int i)
    {
        int bixmax = ~(1<<i);
        return num & bixmax;
    }
    //Update ith elemeent means we (set or Clear) ith bit
    public static int updateithbit(int num,int i,int newbit)
    {
        if(newbit==0)
        {
            int bitmax = ~(1<<i);
            return num & bitmax;
        }
        else
        {
            int bitmax = 1<<i;
            return num | bitmax;
        }
    } 
    // Clear last i bit means we Clear last i no. of bit.
    public static int Clearlastithelement(int num,int i)
    {
        int bixmax = ((-1)<<i);
        return num & bixmax;
    }
    //Clear range of bits means we set 0 from i to j
    public static int ClearRangebit(int num,int i, int j)
    {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmax = a|b;
        return num & bitmax;
    }
    //Check number is power of 2 or not
    public static boolean isPowerof2(int num)
    {
        return (num & (num-1))==0;
    }
    //Check Set(1) bit in Number 
    public static int CheckSetBit(int num)
    {
        int count = 0;
        while(num>0)
        {
            if((num&1)!=0)
            {
                count++;
            }
            num = num>>1;
        }
        return count;
    } 
    //Fast Exponantion
    public static int FastExpo(int num , int i)
    {
        int ans = 1;
        while(i>0)
        {
            if((i & 1) != 0)
            {
                ans = ans*num;
            }
            num = num*num;
            i = i>>1;
        }
        return ans;
    }
    //Add 1 to integer using bit manipulation
    public static int AddONE(int num)
    {
        return (-~num);
    }
    public static void main(String args[])
    {
        System.out.println(FastExpo(1235,3));
    }
}
