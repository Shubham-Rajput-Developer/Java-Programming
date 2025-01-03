public class Friends_Pairing {
    public static int friendspairing(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        //Single
        int single = friendspairing(n-1);
        //Pair        
        int pairway = (n-1)*friendspairing(n-2);

        //Total ways
        int totalways = single+pairway;

        return totalways;


    }
 public static void main(String args[])
 {
    System.out.println(friendspairing(5 ));
 }   
}
