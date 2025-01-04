import java.util.*;
public class JavaFunction {
    // public static void AddNumber()
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Number 1 : ");
    //     int a=sc.nextInt();
    //     System.out.print("Enter Number 2 : ");
    //     int b=sc.nextInt();
    //     int Sum = a+b;
    //     System.out.println("Sum is : "+Sum);

    // }
    // public static void Calculate(int a,int b)
    // {
    //     int Sum = a+b;
    //     System.out.println("Addition is : "+Sum);
    // }

    // public static int Multiplication(int a,int b)
    // {
    //     int pord = a*b;
    //     return pord;
    // }
    public static int factorial(int num)
    {
        int fact = 1;
        for(int i=1;i<=num;i++)
        {
            fact *=i;
        }
        return fact;
        //System.out.println("Factorial is : "+fact);
    }

    public static void BinCoff(int n,int r)
    {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int BinCoff = fact_n/(fact_r*fact_nmr);
        System.out.println("Binomial is : "+BinCoff);
    }
    public static void main(String args[])
    {
       //AddNumber();
       Scanner sc = new Scanner(System.in);
    //    System.out.print("Enter Number 1 : ");
    //    int a=sc.nextInt();
    //    System.out.print("Enter Number 2 : ");
    //    int b=sc.nextInt();
       //Calculate(a, b);
        // int product = Multiplication(a, b);
        // System.out.println("Multiplication is : "+product);
        //System.out.print("Enter number : ");
        //int num = sc.nextInt();
        BinCoff(5, 2);
    }
}
