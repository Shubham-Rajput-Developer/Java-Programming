public class bitOperations {
    public static int getithBit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setithBit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int clearithBit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;

    }
    public static int updateithBit(int n, int i, int newbit){
        if(newbit==0){
            return clearithBit(n, i);
        }
        else{
            return setithBit(n, i);
        }
    }
    public static int clearIBits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearRangeBits(int n,int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static boolean isPowerofTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        //System.out.println(getithBit(10, 3));
        //System.out.println(setithBit(10, 2));
        //System.out.println(clearithBit(10, 3));
        //System.out.println(clearIBits(10, 2));
        //System.out.println(clearRangeBits(10, 2, 4));
        System.out.println(isPowerofTwo(4));
    }
}
