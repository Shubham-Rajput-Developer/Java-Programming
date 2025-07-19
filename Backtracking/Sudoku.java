public class Sudoku {
    public static boolean isSafe(int sudokuBox[][],int row, int col,int digit){
            //column 
            for(int i=0;i<9;i++){
                if(sudokuBox[i][col]==digit){
                    return false;
                }
            } 

            //row
            for(int i=0;i<9;i++){
                if(sudokuBox[row][i]==digit){
                    return false;
                }
            }

            //gird
            int srow = (row/3)*3;
            int scol = (col/3)*3;
            //3X3 grid
            for(int i=srow;i<srow+3;i++){
                for(int j=scol;j<scol+3;j++){
                    if(sudokuBox[i][j]==digit){
                        return false;
                    }
                }
            }
            return true;
        }   
    public static boolean solveSudoku(int sudokuBox[][],int row, int col){
        //base case
        if(row==9 && col==0){
            return true;
        }

        //recursion
        int nextRow = row;
        int nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        //digit present in that box
        if(sudokuBox[row][col]!=0){
            return solveSudoku(sudokuBox, nextRow, nextCol);
        }

        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudokuBox,row,col,digit)){
                sudokuBox[row][col]=digit; //place
                if(solveSudoku(sudokuBox, nextRow, nextCol)){ //solution exists
                    return true;
                }
                sudokuBox[row][col]=0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudokuBox[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudokuBox[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int sudokuBox[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };


        if(solveSudoku(sudokuBox, 0, 0)){
            System.out.println("Solution exists");
            printSudoku(sudokuBox);
        }
        else{
            System.out.println("Solution does not exists");
        }
    }
}
