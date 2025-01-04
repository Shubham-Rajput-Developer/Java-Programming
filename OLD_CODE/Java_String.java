import java.util.*;
public class Java_String {
    public static float shortestpath(String str)
    {
        int x = 0;
        int y = 0;
        for(int i=0;i<str.length();i++)
        {
            int dir = str.charAt(i);
            //WEST
            if(dir == 'W')
            {
                x++;
            }
            //EAST
            else if(dir == 'E')
            {
                x--;
            }
            //NOURTH
            else if(dir == 'N')
            {
                y++;
            }
            else if(dir == 'S')
            {
                y--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // //First way for create string
        // String name = "Shubham";
        // //Second way for create string
        // String LastName = new String("Rajput");
        
        // //Accept String from user
        // String College ;
        // System.out.print("Enter College name : ");
        // College = sc.nextLine(); //that Accept Whole line include space also
        // String Class ;
        // System.out.print("Enter Class name : ");
        // Class = sc.next();    //that Accept only single word 
        
        // System.out.println(name);
        // System.out.println(LastName);
        // System.out.println(College);
        // System.out.println(Class);

        // System.out.println("Length of name is : "+name.length());
        // System.out.println("Length of LastName is : "+LastName.length());
        
        // System.out.println("concatination of name and LastName : "+ (name+LastName));
        // System.out.println("concatination of College and Class is : "+ (College+Class));
        
        // System.out.println("Character at position : "+name.charAt(2));
        // System.out.println("Character at position : "+LastName.charAt(4));

        // System.out.println("String is : ");
        // for(int i=0;i<name.length();i++)
        // {
        //     System.out.print(name.charAt(i));
        // }


        //Find Shortest path 
        String str = "WENNNSWENSS";
        System.out.println("Shortest Path is : "+shortestpath(str));

    }
}
