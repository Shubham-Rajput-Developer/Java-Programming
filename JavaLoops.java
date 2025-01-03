import java.util.Scanner;

public class JavaLoops {
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        // int count = 1;
        // while(count<=10)
        // {
        //     System.out.print(count+" ");
        //     count++;
        // }
        // System.out.println("Enter Range : ");
        // int n = sc.nextInt();
        // int count = 1;
        // int sum = 0;
        // while(count<=n)
        // {
        //     sum = sum+count;
        //     count++;
        // }
        // System.out.println("Sum is : "+sum);
            // for(int i=1;i<=4;i++)
            // {
            //     for(int j=1;j<=4;j++)
            //     {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // int reverse ;
            // int Num = 123456789;
            // while(Num>0)
            // {
            //     int last = Num%10;
            //     reverse = (reverse*10)+10;
            //     //System.out.print(last);
            //     Num = Num/10;
            // }
            // System.out.println(Num);
            // int num = 123456;
            // int rev = 0;
            // while(num>0)
            // {
            //     int last = num%10;
            //     rev = (rev*10)+last;
            //     num = num/10; 
            // }
            // System.out.println(rev);
            // do 
            // {
            //     System.out.println("Enter Number : ");
            //     int num  = sc.nextInt();
            //     if(num%10==0)
            //     {
            //         break;
            //     }
            //     System.out.println(num);
            // }while(true);
            // for(int i=1;i<=5;i++)
            // {
            //     if(i==3)
            //     {
            //         continue;
            //     }
            //     System.out.println(i);
            // }
            // do
            // {
            // System.out.println("Enter Number : ");
            // int num = sc.nextInt();
            // if(num%10==0)
            // {
            //     continue;
            // }
            // System.out.println(num);
            // }while(true);
            // for(int i=0;i<5;i++)
            // {
            //     System.out.println("Hello");
            //     i+=2;
            // }
            // System.out.print("Enter Number : ");
            // int num = sc.nextInt();
            // int fact=1;
            // for(int i=num;i>0;i--)
            // {
            //      fact *= i;
            // }
            // System.out.println("factorial is : "+fact);
            System.out.println("Enter Number : ");
            int num = sc.nextInt();
            for(int i=1;i<num;i++)
            {
                System.out.println(i+"x"+num+"="+(i*num));
            }
    }
}
