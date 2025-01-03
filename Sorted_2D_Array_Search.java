public class Sorted_2D_Array_Search {
        public static void Search_2DArray_BYTOPRIGHT(int matrix[][],int key) //Time Complexity is O(n+m)
    {
        int row = 0;
        int col = matrix[0].length-1;
        int flag = 0;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("Key Element found at : "+"("+row+","+col+")");
                flag = 1;
                break;
            }
            else if(key<matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        if(flag==0)
        {
            System.out.println("element not found!!!");
        }
    }

    //Start serching from Left bottom Element
    public static void Search_2DArray_BYBOTTOMLEFT(int matrix[][],int key)
    {
        int row = matrix.length-1; 
        int col = 0;
        int flag = 0;
        while(row>=0 && col<matrix[0].length)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("Key Element is found at : "+"("+row+","+col+")");
                flag = 1;
                break;
            }
            else if(key<matrix[row][col])
            {
                row--;
            }
            else
            {
                col++;
            }
        }
        if(flag==0)
        {
            System.out.println("element not found!!!");
        }
    }
    public static void main(String args[])
    {
        int matrix[][] = {
                            {10,20,30,40,50},
                            {12,22,33,44,55},
                            {20,25,38,49,60},
                            {35,40,42,50,65}
                        };
        int key = 50;
        Search_2DArray_BYTOPRIGHT(matrix, key);
        Search_2DArray_BYBOTTOMLEFT(matrix, key);
    }
}
