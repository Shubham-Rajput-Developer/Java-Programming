import java.util.*;
public class MultiDimeArrayExample {
    //Check Number of Occurance in 2D Array
    public static void Check_Occurance(int matrix[][],int key)
    {
        int count = 0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    count++;
                }
            }
        }
        System.out.println("Number of Occurance of key element "+key+" is "+count);
    }

    //Sum of Row Element
    public static void Sum_of_Row(int matrix[][])
    {
        int sum = 0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==2)
                {
                    sum = sum+matrix[i][j];
                }
            }
        }
        System.out.println("Sum of Row no. 2 is : "+sum);
    }

    //Transalate matrix element 
    public static void Transpose_Matrix(int matrix[][])
    {
        int row = matrix.length;
        int column = matrix[0].length;
        //Original Matrix
        System.out.println("Original Matrix is : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //Transpose Matrix
        int Transpose[][] = new int[column][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                Transpose[j][i] = matrix[i][j];
            }
        }

        //Print Matrix After Transpose
        System.out.println("Matrix after Transpose is ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(Transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int matrix[][] = {
                            {1,2,7},
                            {7,7,7},
                            {8,7,3}
                            };
        int key = 7;
        Check_Occurance(matrix,key);
        Sum_of_Row(matrix);
        Transpose_Matrix(matrix);
    }
}
