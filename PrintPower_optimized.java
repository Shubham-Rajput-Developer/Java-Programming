public class PrintPower_optimized {
    public static int Power(int x,int n)
    {
        //Base case
        if(n==0)
        {
            return 1;
        }
        int halfpower = Power(x, n/2);
        int pow = halfpower*halfpower;

        //if n is odd
        if(n%2 != 0)
        {
            pow = x*pow;
        }
        return pow;
    }
    public static void main(String args[])
    {
        System.out.println(Power(2,5));
    }
}
