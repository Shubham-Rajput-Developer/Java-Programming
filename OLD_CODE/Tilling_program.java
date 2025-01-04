public class Tilling_program {
    public static int Tilling(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        //Kam 
        int FnM1 = Tilling(n-1);
        int FnM2 = Tilling(n-2);
        int Till = FnM1+FnM2;
        return Till;
    }
public static void main(String args[])
{
    int n = 5; 
    System.out.println(Tilling(n));
}
}
