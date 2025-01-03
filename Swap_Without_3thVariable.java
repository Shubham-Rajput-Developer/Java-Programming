public class Swap_Without_3thVariable {
 public static void main(String args[])
 {
    int x = 9;
    int y = 80;
    System.out.println("Before Swaping :");
    System.out.println("X is : "+x+" Y is : "+y);
    x = x^y;
    y = x^y;
    x = x^y;
    System.out.println("After Swaping :");
    System.out.println("X is : "+x+" Y is : "+y);
 }   
}
