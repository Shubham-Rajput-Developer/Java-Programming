import java.util.*;
public class JavaCondition {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number 1 : ");
        // int a = sc.nextInt();
        // System.out.println("Enter Number 2 : ");
        // int b = sc.nextInt();

        // if(a>b)
        // {
        //     System.out.println("A is Greater");
        // }
        // if(a==b)
        // {
        //     System.out.println("A and B is Same");
        // }
        // else
        // {
        //     System.out.println("B is Greater");
        // }
        // System.out.println("Enter Number : ");
        // int a = sc.nextInt();
        // if(a%2==0)
        // {
        //     System.out.println("Even");
        // }
        // else
        // {
        //     System.out.println("Odd");
        // }

        // System.out.println("Enter A : ");
        // int a = sc.nextInt();
        // System.out.println("Enter B : ");
        // int b = sc.nextInt();
        // System.out.println("Enter C : ");
        // int c = sc.nextInt();

        // if(a>b)
        // {
        //     if(a>c)
        //     {
        //         System.out.println("A is Greater ");
        //     }
        //     else
        //     {
        //         System.out.println("C is Greater ");
        //     }
        // }
        // else
        // {
        //     if(b>c)
        //     {
        //     System.out.println("B is Greater");
        //     }
        //     else
        //     {
        //         System.out.println("C is Greater");
        //     }
        // }

        // if((a>b)&&(a>c))
        // {
        //     System.out.println("A is Greater");
        // }
        // else if(b>c)
        // {
        //     System.out.println("B is Greater ");
        // }
        // else
        // {
        //     System.out.println("C is Greater");
        // }
        // System.out.println("Enter Number : ");
        // int Num = sc.nextInt();

        // String type = ((Num%2)==0)?"Even":"Odd";
        // System.out.println("Type is : "+type);
            // System.out.println("Enter Choice : ");
            // int ch = sc.nextInt();

            // switch(ch)
            // {
            //     case 1:
            //     System.out.println("OPPPO");
            //     break;
            //     case 2 : 
            //     System.out.println("Vivoo");
            //     break;
            //     case 3:
            //     System.out.println("Xoumi");
            //     break;
            // }

            //  System.out.println("Enter Number : ");
            //  int Num = sc.nextInt();

            //  String data = (Num>0)?"Positive":"Negative";
            //  System.out.println(data);

            // System.out.println("Enter Tempreture : ");
            // float temp = sc.nextFloat();

            // if(temp>100)
            // {
            //     System.out.println("You have Fever");
            // }
            // else
            // {
            //     System.out.println("You don't have Fever");
            // }
             
            System.out.println("Enter Week day Number : ");
            int day = sc.nextInt();

            switch(day)
            {
                case 1:
                    System.out.println("Today is Monday");
                    break;
                case 2:
                    System.out.println("Today is Tuesday");
                    break;
                case 3:
                    System.out.println("Today is Wednesday");
                    break;
                case 4:
                    System.out.println("Today is Thursday");
                    break;
                case 5:
                    System.out.println("Today is Friday");
                    break;
                case 6:
                    System.out.println("Today is Saturday");
                    break;
                    case 7:
                System.out.println("Today is Sunday");
                    break;
                
            }

    }
    
}
