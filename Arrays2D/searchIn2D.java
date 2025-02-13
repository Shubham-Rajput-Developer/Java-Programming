package Arrays2D;

public class searchIn2D {
    public static boolean SearchBruteForce(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean staircaseTOPRIGHTSearch(int matrix[][],int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at : ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found ");
        return false;
    }
    public static boolean staircaseLEFTBOTTOMSearch(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==target){
                return true;
            }
            else if(target<matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key = 33;
        System.out.println(staircaseLEFTBOTTOMSearch(matrix,key));
    }
}
