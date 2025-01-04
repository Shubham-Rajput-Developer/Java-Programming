import java.util.*;
public class Function_Overloading {
    public static int Sum(int a,int b)
    {
        return a+b;
    }
    public static int Sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static float Sum(float a,float b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        System.out.println(Sum(10,20));
        System.out.println(Sum((float)10.5,(float) 20.6));
        System.out.println(Sum(10,20,30));
        
    }
}
