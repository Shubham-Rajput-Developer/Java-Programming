public class Grid {
    // public static int gridWays(int i, int j, int n, int m){
    //     if(i==n-1 && j==m-1){
    //         return 1;
    //     }
    //     else if(i==n || j==m){
    //         return 0;
    //     }
    //     int w1 = gridWays(i+1, j, n, m);
    //     int w2 = gridWays(i, j+1, n, m);
    //     int total = w1+w2;
    //     return total;
    // }

    public static long factorial(int n){
        long result = 1;
        for(int i=2;i<=n;i++){
            result *=i;
        }
        return result;
    }
    public static long countWay(int n, int m){
        return factorial((n-1 + m-1)) / (factorial(n-1)*factorial(m-1));
    }
   public static void main(String agrs[]){
    int n=4, m=4;
    //System.out.println("Total way to go from source to destination: "+gridWays(0, 0, n, m));
    System.out.println("Total way to go from source to destination: "+countWay( n, m));
   
    } 
}
