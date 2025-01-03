import java.util.*;
public class BintoDec {
    public static void bintoDec(int n)
    {
        int pow = 0;
        int DecNum = 0;
        while(n>0)
        {
            int lastdigit = n%10;
            DecNum = DecNum+(int)(lastdigit*Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println("Number convert from Binary to Decimal is : "+DecNum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        bintoDec(n);
        sc.close();
    }
    
}
