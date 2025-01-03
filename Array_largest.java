public class Array_largest {
    public static void Largest(int number[])
    {
        int large = number[0];
        for(int i=1;i<number.length;i++)
        {
            if(large<number[i])
            {
                large = number[i];
            }
        }
        System.out.println("Largest Number is : "+large);
    }
    public static void Smallest(int number[])
    {
        int small = number[0];
        for(int i=0;i<number.length;i++)
        {
            if(number[i]<small)
            {
                small = number[i];
            }
        }
        System.out.println("Smallest Number is : "+small);
    }
    public static void main(String args[])
    {
        int number[] = {10,2,34,56,45,33,8,11,67,4};
        Largest(number);
        Smallest(number);
    }
    
}
