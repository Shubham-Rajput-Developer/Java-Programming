public class JavaFunction2 {
    public static int sum(int a , int b)
    {
        int add = a+b;
        return add;
    }
    public static float sum(float a, float b)
    {
        float add = a+b;
        return add;
    }
    public static void sum(int a, int b ,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String args[])
    {
        System.out.println(sum(20,30));
        System.out.println(sum(2.54f,54.6f));
        sum(2,4,54);
    }
    
}
