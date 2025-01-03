import java.util.*;
import java.util.Arrays;
public class String_Que_2{
    public static void anagrams_string(String s1,String s2)
    {
        //Convert Strings to lowercase. Why? so thatwe don't have to checkseparately for lower & uppercase.
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();

        // First check - if the lengths are the same
        if(str1.length() == str2.length())
        {
            // convert strings into char array
            char Str1CharArray[] = str1.toCharArray();
            char Str2CharArray[] = str2.toCharArray();

            // sort the char array
            Arrays.sort(Str1CharArray);
            Arrays.sort(Str2CharArray);

            // if the sorted char arrays are sameor identical then the strings areanagram
            boolean result = Arrays.equals(Str1CharArray, Str2CharArray);

            if(result)
            {
                System.out.println(str1+" and "+str2+" are both anagrams to each other...");    
            }
            else
            {
                System.out.println(str1+" and "+str2+" are Not anagrams");
            }
        }
        else
        {
            // case when lengths are not equa
            System.out.println(str1+" and "+str2+" are Not anagrams");
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter String2 : ");
        String str2 = sc.nextLine();
        anagrams_string(str1,str2);
    }
}