public class Knights {
    public static void KnightsTour(int i, int j, int N, int matrix[][],int moveNumber){
        //base
        if(i<0 || j<0 || i>=N || j>=N){
            return;
        }

        //if we visited itbefore
        if(matrix[i][j]!=0){
            return;
        }

        matrix[i][j]=moveNumber;

        if(moveNumber==N*N-1){
            for(int x=0;x<N;x++){
                for(int y=0;y<N;y++){
                    System.out.print(matrix[x][y]+" ");
                }
                System.out.println();
            }
            return; 
        }


        //calls
        KnightsTour(i-2, j-1, N, matrix, moveNumber+1);
        KnightsTour(i-2, j+1, N, matrix, moveNumber+1);
        KnightsTour(i-1, j+2, N, matrix, moveNumber+1);
        KnightsTour(i-1, j-2, N, matrix, moveNumber+1);
        KnightsTour(i+1, j-2, N, matrix, moveNumber+1);
        KnightsTour(i+1, j+2, N, matrix, moveNumber+1);
        KnightsTour(i+2, j-1, N, matrix, moveNumber+1);
        KnightsTour(i+2, j+1, N, matrix, moveNumber+1);
        
        matrix[i][j]=0;
        
    }
    public static void main(String args[]){
        KnightsTour(0,0,8,new int[8][8],0);
    }
}



// grid[i][j] = moveNumber;

// int[] dx = {-2,-1,1,2,2,1,-1,-2};
// int[] dy = {-1,-2,-2,-1,1,2,2,1};

// for(int k=0; k<8; k++){
//     if(Tour(grid, i+dx[k], j+dy[k], moveNumber+1)){
//         return true;
//     }
// }

// grid[i][j] = 0; // backtrack
// return false;

