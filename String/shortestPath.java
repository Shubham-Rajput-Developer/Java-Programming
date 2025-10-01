package String;


public class shortestPath {
    public static int checkDistance(String path){
        int x = 0;
        int y = 0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if( dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
        }
        int xSqu = x*x;
        int ySqu = y*y;
        return (int) Math.sqrt(xSqu+ySqu);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(checkDistance(path));
    }
}
