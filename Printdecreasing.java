public class Printdecreasing {
    public static void Print(int num)
    {
        if(num==1)
        {
            System.out.println(num);
            return;
        }
        System.out.println(num);
        Print(num-1);
    }
    public static void main(String args[])
    {
        int num = 10;
        Print(num);
    }
}
