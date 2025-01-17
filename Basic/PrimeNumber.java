package Basic;
import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i=2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int range){
        int count = 0;
        for(int i=2;i<=range;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\n Total prime number in between 2 to "+range+" is "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Number to check prime or not : ");
        // int num = sc.nextInt();
        // if(num==2){
        //     System.out.println("Num is prime number");
        // }
        // else{
        //     boolean isPrime = true;
        //     for(int i=2;i<=Math.sqrt(num);i++){
        //         if(num%i==0){
        //             isPrime=false;
        //         }
        //     }
        //     if(isPrime==true){
        //         System.out.println("Num is prime number ");
        //     }
        //     else{
        //         System.out.println("Num is not prime number ");
        //     }
        // }

        //System.out.println(isPrime(num));

        System.out.print("Enter Range Number : ");
        int range = sc.nextInt();
        PrimeInRange(range);

        sc.close();
    }
}
