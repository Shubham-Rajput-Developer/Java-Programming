import java.util.*;
public class JavaFunction3 {
public static void avgof3(int a, int b, int c)
    {
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("Average is : "+avg);
    }
public static boolean isEven(int n)
{
    if(n%2==0)
    {
        return true;
    }
    return false;
}
public static int reverse(int Num)
{
    int rev=0;
    while(Num>0)
    {
     int last = Num%10;
     rev = last+(rev*10);
     Num = Num/10;
    }
    return rev;
}
public static void Palidrome(int Num)
{
    if(Num==reverse(Num))
    {
        System.out.println("Number is Palidrome");
    }
    else
    {
    System.out.println("Number is Not Palidrome");
    }
}

public static void SumofDigit(int num)
{
    int sum = 0;
    while(num!=0)
    {
        sum = sum+(num%10);
        num = num/10;
    }
    System.out.println("Sum of Digit is : "+sum);
}
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number :");
    int num = sc.nextInt();
   Palidrome(num);
    SumofDigit(num);
   }
    
}
