public class Array_Twise_value {
    public static boolean check_twise(int number[])
    {
        for(int i=0;i<number.length;i++)
        {
            int data = number[i];
            for(int j=i+1;j<number.length;j++)
            {
                if(data==number[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int number[] = {1,2,3,1,4};
        System.out.println(check_twise(number));
    }
}   
