public class Factorial {
    public static int  Print_fact(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        int fact = num * Print_fact(num-1);
        return fact;
    }
    public static void main(String args[])
    {
        int num = 5;
        System.out.println(Print_fact(num));
    }

}
