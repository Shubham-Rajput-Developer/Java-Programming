package Basic;
import java.util.Scanner;

public class EvenOdd {

    public static boolean Check(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        // if(n%2==0){
        //     System.out.println("Number is Even");
        // }
        // else{
        //     System.out.println("Number is Odd");
        // }

        System.out.println(Check(n));
        sc.close();

    }   
}
