import java.util.*;
class JavaBasics
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of Pen : ");
        float $ = sc.nextFloat();
        System.out.println("Enter price of Pencil : ");
        float Pencil = sc.nextFloat();
        System.out.println("Enter price of Eraser : ");
        float Eraser = sc.nextFloat();
        
        float total = $+Pencil+Eraser;
        System.out.println("Bill is : "+total);

        float newTotal = total+(total*0.18f);

        System.out.println("Adding 18% GST : "+newTotal);
        sc.close();
    }
}