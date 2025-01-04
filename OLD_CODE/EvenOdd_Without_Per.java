import java.util.*;
public class EvenOdd_Without_Per{

    public static void check(int a){
        int n=1;
        int result=a & n;
        if(result==1){
            System.out.println("No. is Odd");
        }else{
            System.out.println("No. is Even");
        }
    }
    public static void main(String[] args) {
        check(11);
        check(20);
        check(467);
    }
}