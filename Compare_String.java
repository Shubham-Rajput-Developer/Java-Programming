import java.util.*;
public class Compare_String {
    public static void main(String args[])
    {
        String s1 = "Shubham";
        String s2 = "Shubham";
        String s3 = new String("Shubham");

        if(s1 == s2)
        {
            System.out.println("String are equals..");
        }
        else
        {
            System.out.println("String are not equals..");
        }

        if(s1 == s3)
        {
            System.out.println("String are equals..");
        }
        else
        {
            System.out.println("String are not equals..");
        }

        if(s1.equals(s3))
        {
            System.out.println("String are equals..");
        }
        else
        {
            System.out.println("String are not equals..");
        }
    }
}
