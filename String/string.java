package String;

import java.util.Scanner;

public class string {
    public static void printletter(String name){
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
    public static boolean checkPalindrome(String str){
        for(int i=0;i<str.length();i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        // System.out.println(name);
        // System.out.println(name.length());
        // System.out.println(name+" "+"rajput");
        //printletter(name);
        System.out.println(checkPalindrome(name));
        sc.close();
    }
}
