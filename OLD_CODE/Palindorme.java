import java.util.*;
public class Palindorme {
    public static void Palidrome_data(int num)
    {
        int temp = num ;
        int rev = 0;
        while(temp!=0)
        {
            rev = rev*10;
            rev = rev+(temp%10);
            temp = temp/10;
        }
        if(rev==num)
        {
        System.out.println("Number is Palindorme");
        }
        else
        {
            System.out.println("Number is Not Palindrome");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        Palidrome_data(num);
    }    
}
