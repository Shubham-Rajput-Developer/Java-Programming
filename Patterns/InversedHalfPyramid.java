package Patterns;

import java.util.Scanner;

public class InversedHalfPyramid {
    public static void DrawHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        DrawHalfPyramid(n);
        sc.close();
    }
}
