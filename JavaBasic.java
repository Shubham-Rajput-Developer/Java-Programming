import java.util.Scanner;

public class JavaBasic {
    public static void main(String[] args) {
        // int a = 10;
        // System.out.println("Shubham");
        // System.out.println("a");
        // System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int sum = a+b;
        int product = a*b;
        System.out.println("Sum is : "+sum);
        System.out.println("Product is : "+product);
    }
}

