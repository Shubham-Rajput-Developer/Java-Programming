public class CountSetBits{
    public static int countBits(int n){
        int count=0;
        while(n>0){
            if((1&n)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countBits(15));
    }
}