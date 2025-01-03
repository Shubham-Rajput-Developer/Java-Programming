import java.util.*;
public class DectoBin {
    public static void dectoBin(int n)
    {
        int pow = 0;
        int BinNum = 0;
        while(n>0)
        {
            int rem = n%2;
            BinNum = BinNum+(int)(rem*Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("Number Convert from Decimal to Binary is : "+BinNum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        dectoBin(n);
    }
    
}
