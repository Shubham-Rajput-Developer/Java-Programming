import java.util.Scanner;

public class Palindrome {
    public static void checkPalindrome(int n){
        int rev = 0;
        int num = n;
        while(num>0){
            int lastDigit = num%10;
            rev = (rev*10)+lastDigit;
            num = num/10;
        }
        if(rev==n){
            System.out.println(n+" is Palindrome");
        }
        else{
            System.out.println(n+" is not Palindrome");
        }

    }

    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check palindrome or not : ");
        int num = sc.nextInt();

        checkPalindrome(num);
        sc.close();
    }
}