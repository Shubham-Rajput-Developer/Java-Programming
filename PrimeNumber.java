import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check prime or not : ");
        int num = sc.nextInt();
        if(num==2){
            System.out.println("Num is prime number");
        }
        else{
            boolean isPrime = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("Num is prime number ");
            }
            else{
                System.out.println("Num is not prime number ");
            }
        }
        sc.close();
    }
}
