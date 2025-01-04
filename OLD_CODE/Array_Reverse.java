public class Array_Reverse {
    public static void Reverse(int number[])
    {
        int start = 0;
        int last = number.length-1;
        while(start<last)
        {
            int temp = number[last];
            number[last] = number[start];
            number[start] = temp;

            start++;
            last--;
        }
    }
    public static void main(String args[])
    {
        int number[] = {10,20,30,40,50,60,70,80,90};
        System.out.println("Array before Revrsing..");
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
        Reverse(number);
        System.out.println("\nArray after Reversing..");
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
    }
    
}
