import java.util.Scanner;

public class BinaryTODecimal {
    public static  void ConvertToDecimal(int Binary){
        int pow = 0;
        int decimal = 0;
        while(Binary>0){
            int lastDigit = Binary%10;
            decimal = decimal+(lastDigit* (int) Math.pow(2, pow));
            pow++;
            Binary = Binary/10;
        }
        System.out.println(decimal);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary number : ");
        int Binary = sc.nextInt();
        ConvertToDecimal(Binary);
        sc.close();
    }
}
