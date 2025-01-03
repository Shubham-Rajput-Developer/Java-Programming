public class Array_pairs {
    public static void main(String args[])
    {
        int tot = 0;
        int number[] = {2,4,6,8};
        for(int i=0;i<number.length;i++)
        {
            for(int j=i+1 ; j<number.length ; j++)
            {
                System.out.print("("+number[i]+","+number[j]+")");
                tot++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs is : "+tot);
    }
    
}
