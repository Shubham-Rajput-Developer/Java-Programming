import java.util.*;
public class IncomeTax {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Income : ");
        int income = sc.nextInt();
        int tax;
        sc.close();
        if(income<500000)
        {
            tax = 0;
            System.out.println("Tax is : "+tax);
        }
        else if((income>=500000)&&(income>1000000))
        {
            tax = (int)(income*0.2);
            System.out.println("Tax is : "+tax);
        }
        else
        {
            tax = (int)(income*0.3);
            System.out.println("Tax is : "+tax);
        }
    }
}
