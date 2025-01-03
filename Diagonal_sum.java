import java.util.*;
public class Diagonal_sum {
    //Primary Diagonal element is Present at i==j th place 
    //Secondary Diagonal element is present at i+j == n-1 place
    
    public static void Diagonalsum1(int matrix[][])
    {
        //Its Broute force technics
        //Time complexity is O(n^2)
        int sum = 0;
        int Primary_sum=0;
        int Secondary_sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                if(i==j)
                {
                    Primary_sum = Primary_sum+matrix[i][j];
                }
                else if((i+j) == (matrix.length-1) )
                {
                    Secondary_sum = Secondary_sum+matrix[i][j];
                }
            }
        }
        sum = Primary_sum+Secondary_sum;
        System.out.println("Primary Diagonal Sum is : "+Primary_sum);
        System.out.println("Secondary Diagonal Sum is : "+Secondary_sum); 
        System.out.println("Diagonal Sum is : "+sum);
    }
    //It is optimized Technics for Diagnal Sum O(n)
    public static void Diagonalsum2(int matrix[][])
    {
        int sum = 0;
        for(int i=0 ; i<matrix.length; i++)
        {
            //For Primary Diagonal 
            sum += matrix[i][i];

            //for Secondary Diagonal
            if(i != matrix.length-1-i)
            {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println("Diagonal sum is : "+sum);
    }

    //program code with Time Complexity is O(n)
    public static void Diagonalsum3(int matrix[][])
    {
        int i=0;
        int sum=0;
        while(i<matrix.length )
        {
            sum = sum+matrix[i][i];
            i++;
        }
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(row==col)
            {
             
            }
            else
            {
            sum = sum+matrix[row][col];
            }
            row++;
            col--;
        }
        System.out.println("Sum of Primary Diagonal : "+sum);
    }
    public static void main(String arg[])
    {
        int matrix[][] = {
                            {1,2,3},
                            {5,6,7},
                            {9,10,11},
                        };
        //Diagonalsum1(matrix);
         //Diagonalsum2(matrix);
         Diagonalsum3(matrix);
    }   
}
