package Patterns;

import java.util.Scanner;

public class InversedHalfPyramidWithNumber {

    public static void Draw(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        Draw(n);
        sc.close();
    }
}
