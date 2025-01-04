public class Fibonaci_Series {
    public static int Fibonacci(int num)
    {
        
        if(num == 1 )
        {
            return 1;
        }
        if(num == 0)
        {
            return 0;
        }
        int fibNM1 = Fibonacci(num-1);
        int fibNM2 = Fibonacci(num-2);
        int fibN = fibNM1 + fibNM2;
        return fibN;

    }
 public static void main(String args[])
 {
    int num = 29 ;
    System.out.println(Fibonacci(num));
 }
 
}
