import java.util.Scanner;

public class JavaBasic {
    public static void main(String[] args) {
        // int a = 10;
        // System.out.println("Shubham");
        // System.out.println("a");
        // System.out.println(a);

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter b: ");
        // int b = sc.nextInt();
        // int sum = a+b;
        // int product = a*b;
        // System.out.println("Sum is : "+sum);
        // System.out.println("Product is : "+product);

        // //Area of circle
        // System.out.println("Enter radius : ");
        // float r = sc.nextFloat();
        // float area = 3.14f*r*r;
        // System.out.println("Area of circle is : "+area);

        //Practice qustions

        // System.out.print("Enter no 1 : ");
        // int a = sc.nextInt();
        // System.out.print("Enter no 2 : ");
        // int b = sc.nextInt();
        // System.out.print("Enter no 3 : ");
        // int c = sc.nextInt();
        // int avg = (a+b+c)/3;
        // double totalWithGst = (a + b + c) * (1 + 18.0 / 100);
        // System.out.println("Average is : "+avg);
        // System.out.println("Total cost with GST : "+totalWithGst);

        // System.out.println("Enter side : ");
        // int side = sc.nextInt();
        // int area = side*side;
        // System.out.println("Area of sqaure is : "+area);

        System.out.println("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.println("Addition is : "+(a+b));
        // System.out.println("Subtraction is : "+(a-b));
        // System.out.println("Modulo is : "+(a%b));
        // System.out.println("Unary operator (Pre increment) : "+(++a));
        // System.out.println("Unary operator (Post increment) : "+(b++));
        // System.out.println("a equals b o not : "+(a==b));
        // System.out.println("a equals b or not : "+(a!=b));
        b += a;
        System.out.println(b);
        
    }
}

