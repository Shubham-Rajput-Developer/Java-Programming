package Arrays2D;

public class transposeMatrix {
    public static void main(String agrs[]){
        int matrix[][] = {
            {2,3,4,5},
            {6,7,8,9}
        };
        System.out.println("Original Matrix is : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int transpose[][] = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i] = matrix[i][j];
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix is : ");
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }  
}
