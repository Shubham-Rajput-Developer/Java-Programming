package Arrays2D;

import java.util.Scanner;

public class MatrixBasic {
    public static void Search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Key found at location : ("+i+","+j+")");
                }
            }
        }
    }
    public static void Largest(int matrix[][]){
        int largest = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(largest<matrix[i][j])
                {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("largest element in array : "+largest);
    }
    public static void Smallest(int matrix[][]){
        int small = 0; 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(small>matrix[i][j])
                {
                    small = matrix[i][j];
                }
            }
        }
        System.out.println("smallest element in array : "+small);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int row = sc.nextInt();
        System.out.println("Enter column number : ");
        int column = sc.nextInt();

        int matrix[][] = new int[row][column];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array element is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        Search(matrix,5);
        Largest(matrix);
        Smallest(matrix);
        sc.close();

    }
}
