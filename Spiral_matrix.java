public class Spiral_matrix {
    public static void SpiralPrint(int matrix[][])
    {
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length-1;
        int EndCol = matrix[0].length-1;

        while(StartRow<=EndRow && StartCol<=EndCol)
        {
            //printing Top line element 
            for(int i=StartCol;i<=EndCol;i++)
            {
                System.out.print(matrix[StartRow][i]+" ");
            }

            //printing Right line element
            for(int i=StartRow+1;i<=EndRow;i++)
            {
                System.out.print(matrix[i][EndCol]+" ");
            }

            //printing Bottom line Element 
            for(int i=EndCol-1;i>=StartRow;i--)
            {
                System.out.print(matrix[EndRow][i]+" ");
            }

            //printing left line element 
            for(int i=EndRow-1;i>=StartRow+1;i--)
            {
                System.out.print(matrix[i][StartCol]+" ");
            }
            StartRow++;
            StartCol++;
            EndRow--;
            EndCol--;
        }
    }
    public static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                        };
        SpiralPrint(matrix);
    }
    
}