import java.util.*;
import java.util.LinkedList;

public class FirstNonRepeating {
    public static char printNonReapeting(String str){
        int freuency[]=new int[26];
        Queue<Character> q = new LinkedList<>();
        char ans = '-';
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freuency[ch-'a']++;
            while(!q.isEmpty() && freuency[q.peek()-'a']>1){
                q.remove();
            }

            if(q.isEmpty()){
                ans = '-';
            }else{
                ans = q.peek();
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String str = "aabccxb";
        System.out.println("First Non reapeting char is : "+printNonReapeting(str));

    }

} 

