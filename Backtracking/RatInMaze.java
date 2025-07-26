public class RatInMaze{
    public static int findWays(int maze[][],int row, int col){
        //base
        if(col<0 || row<0 || row>=maze.length || col>=maze.length || maze[row][col]==0){
            return 0;
        }

        if(row==maze.length-1 && col==maze.length-1){
            return 1;
        }
        
        //Visited
        maze[row][col]=0;

        //recursion
        int up = findWays(maze, row-1, col);
        int down = findWays(maze, row+1, col);
        int left = findWays(maze, row, col-1);
        int right = findWays(maze, row, col+1);

        maze[row][col]=1;

        int totalWays = up+down+left+right;
        return totalWays;
    }
    public static void Print(int maze[][]){
        System.out.println("-----Maze after calls------");
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] = {
            {1,1,0,0},
            {1,1,0,1},
            {1,1,0,1},
            {1,1,1,1}
        };

        System.out.println("Total ways: "+findWays(maze,0,0));
        Print(maze);
    }
}