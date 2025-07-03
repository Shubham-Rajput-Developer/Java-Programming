public class evenOdd {
    public static void checkOddorEven(int n){
        int bitmask = 1;
        if((n & bitmask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String args[]){
        checkOddorEven(8);
        checkOddorEven(221);
        checkOddorEven(90);
        checkOddorEven(3);
    }
}
