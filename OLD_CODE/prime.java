 import java.util.*;
 public class prime{
 public static boolean isprime(int num)
    {
        if(num==2)
        {
            return true;
        }
        //boolean isprime = true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void Range(int n)
    {
        for(int i=2;i<=n;i++)
        {
        if(isprime(i))
        {
         System.out.print(i+" ");
        }
        }       
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int num = sc.nextInt();
        Range(num);
        sc.close();
    }
}