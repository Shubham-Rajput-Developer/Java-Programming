public class swapWithoutThirdVariable {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swaping : ");
        System.out.println("x is : "+x);
        System.out.println("y is : "+y);
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("after swaping : ");
        System.out.println("x is : "+x);
        System.out.println("y is : "+y);
    }
}


