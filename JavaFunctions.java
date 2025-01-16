import java.util.Scanner;

public class JavaFunctions {
    public static int Product(int a, int b){
        return a*b;
    }

    public static int Factorial(int a){
        int fact = 1;
        for(int i=a;i>0;i--){
            fact = fact*i;
        }
        return fact;
    }

    public static int BinomialCoficient(int n, int r){   
        int result = Factorial(n)/(Factorial(r)*Factorial(n-r));
        return result;
    }

    public static float Average(int a, int b, int c){
        int sum = a+b+c;
        int avg = sum/3;
        return avg;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Num 2 : ");
        int b = sc.nextInt();
        System.out.print("Enter Num 3 : ");
        int c = sc.nextInt();

        System.out.println("Product is : "+Product(a, b));
        
        System.out.println("Factorial of Num a is : "+Factorial(a));
        
        System.out.println("Binomial coificient of a and b i s: "+BinomialCoficient(a, b));
        
        System.out.println("Average of three number is : "+Average(a,b,c));
        sc.close();
    }
}
