package Patterns;

import java.util.Scanner;

public class HollowPattern {

    public static void DrawHollowPatterns(int row,int column){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1||i==row||j==1||j==column){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = sc.nextInt();
        System.out.print("Enter column : ");
        int column = sc.nextInt();
        
        DrawHollowPatterns(row,column);
        sc.close();
    }
}
