public class Printincreasing {
    public static void Print(int num)
    {
        if(num==1)
        {
            System.out.println(num);
            return;
        }
        Print(num-1);
        System.out.println(num);
    }
    public static void main(String args[])
    {
        int num = 10;
        Print(num);
    }
}
