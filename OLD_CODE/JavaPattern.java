public class JavaPattern {
    public static void main(String args[])
    {
        
        // for(int i=0;i<=5;i++)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Inverse Star Pattern
        // for(int i=5;i>=0;i--)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Half Pyramid Pattern
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        
        //Char Pattern
        char ch='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
