public class isPowerofTwo{
    public static boolean clear(int n){  
        return (n & (n-1))==0 ;
    }
    public static void main(String args[]){
        System.out.println(clear(8));
    }
}