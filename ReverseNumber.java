import java.util.Scanner;
public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        // while(n>0){
        //     int lastDigit = n%10;
        //     System.out.print(lastDigit);
        //     n=n/10;
        // }
        // System.out.println();

        int rev = 0;
        while (n>0) {
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }
        System.out.println(rev);

        sc.close();
    }
}
