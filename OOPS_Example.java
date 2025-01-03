import java.util.*;
public class OOPS_Example {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int real = sc.nextInt();
        int img = sc.nextInt();
        

        Complex obj = new Complex();
        System.out.println(obj.Sum(real,img));
    }

}

class Complex
{
    
    int Sum(int r,int i)
    {
        return r+i;
    }
}