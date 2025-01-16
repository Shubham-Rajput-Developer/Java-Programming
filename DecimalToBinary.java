import java.util.Scanner;

public class DecimalToBinary {

    public static void ConvertToBinary(int decimal){
        int pow = 0;
        int Binary = 0;
        while(decimal>0){
            int rem = decimal%2;
            Binary = Binary+(rem* (int) Math.pow(10, pow));
            pow++;
            decimal = decimal/2;
        }
        System.out.println(Binary);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int decimal = sc.nextInt();
        ConvertToBinary(decimal);
        sc.close();
    }
}
