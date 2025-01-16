package Patterns;

import java.util.Scanner;

public class NumberPatternsWithSpace {
    public static void Draw(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=0;j<(2*i-1);j++){
                if(j%2==0){
                System.out.print(i+" ");
                }
                else{
                    System.out.print("  ");
                }
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
