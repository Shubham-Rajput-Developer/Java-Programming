public class Print_Natural_No {
    public static int Sum_of_Natural(int num)
    {
        int sum = 0;
        if(num == 1)
        {
            return 1;
        }
        sum = num + Sum_of_Natural(num-1);
        return sum;
    }
 public static void main(String args[])
 {
    int num = 5;
    System.out.println(Sum_of_Natural(num));
 }   
}
