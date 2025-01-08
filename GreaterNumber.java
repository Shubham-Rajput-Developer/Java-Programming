import java.util.*;
public class GreaterNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a>=b)&&(a>=c)){
            System.out.println("A is greater ");
        }
        else if(b>=c){
            System.out.println("B is greater");
        }
        else{
            System.out.println("C is greater");
        }
    }
}
