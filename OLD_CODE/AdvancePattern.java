import java.util.*;
public class AdvancePattern {
    public static void HollowRectangle()
    {
        System.out.print("Enter Row number : ");
        int rowno = sc.nextInt();
        System.out.print("Enter Column number : ");
        int colno = sc.nextInt();
        for(int i=1;i<=rowno;i++)
        {
            for(int j=1;j<=colno;j++)
            {
                if(i==1 || i==rowno || j==1 || j==colno)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Inverted_half_paramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Inverted_half_paramid_Num(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i+1);j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyds_Triangle(int n)
    {
        int counter = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n)
    {
        //for upper part
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //for lower part
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Solid_Romhbus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Hollow_Romhbus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Diamond(int n)
    {
        //for upper part
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Number_Diamond(int n)
    {
        //Upper Part
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        //lower part
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void Palidrome(int n)
    {
        int number_line = 1;
        int sp = n-1;
        int st = 2*number_line-1;
        while (number_line<=n) 
        {
            for(int i=0;i<sp;i++)
            {
                System.out.print(" ");
            }
            int current = number_line;
            for(int i=0;i<st;i++)
            {
                System.out.print(current);
            if(i<st/2)
            {
                current--;
            }
            else
            {
                current++;
            }
        }
        
        System.out.println();
        sp--;
        st=st+2;
        number_line++;
    }
    }
    public static void Number_Space_Diamond(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                if(j==1||j==(2*i-1)||i==1||i==n)
                {
                System.out.print(i);
                }
                else
                {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                if(j==1||j==(2*i-1)||i==1||i==n)
                {
                System.out.print(i);
                }
                else
                {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void Number_Space_Diamond_half(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
            System.out.print(" ");
            }

        for(int j=0;j<(2*i-1);j++)
        {
            if(j%2==0)
            {
            System.out.print(i);
            }
            else
            {
                System.out.print(" ");
            }
            
        }
        System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        //HollowRectangle();
        // Inverted_half_paramid(n);
        // Inverted_half_paramid_Num(n);
        //floyds_Triangle(n);
        //zero_one_triangle(n);
        //Butterfly(n);
        //Solid_Romhbus(n);
       // Hollow_Romhbus(n);
       //Diamond(n);
       //Number_Diamond(n);
       //Palidrome(n);
       //Number_Space_Diamond(n);
       //Number_Space_Diamond_half(n);
    }
    
}
