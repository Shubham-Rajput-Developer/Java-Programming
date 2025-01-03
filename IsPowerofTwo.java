import java.util.*;
public class IsPowerofTwo{
    public static void clear(int n){  
        System.out.println((n & (n-1)) == 0);
    }
    public static void main(String args[]){
        clear(8);
    }
}