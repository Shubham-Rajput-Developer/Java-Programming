import java.util.*;
public class String_Que_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            switch (ch) 
            {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'u':
                    count++; 
                    break;
                case 'o':
                    count++;
                    break;
            }
        }
        System.out.println("lowercase vowels accurred in a string : "+count);
    }
    
}
