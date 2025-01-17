import java.util.Scanner;

public class FunctionOverloading {

    public static int Sum(int a, int b){
        return a+b;
    }
    
    public static int Sum(int a, int b, int c){
        return a+b+c;
    }

    public static float Sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Num 2 : ");
        int b = sc.nextInt();
        System.out.print("Enter Num 3 : ");
        int c = sc.nextInt();

        System.out.println(Sum(a,b));
        System.out.println(Sum(a,b,c));
        System.out.println(Sum(4.4f,5.5f));
        sc.close();
    }
}
