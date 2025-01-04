import java.util.*;
public class AnagramsAk{
    public static boolean check(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char array1[]=new char[20];
        char array2[]=new char[20];
        for(int i=0;i<str1.length();i++){
           array1[i]=str1.charAt(i);
           array2[i]=str2.charAt(i);
        }
        for(int i=0;i<array1.length;i++){
            for(int j=1;j<array1.length;j++){
                if(array1[i]>array1[j]){
                    char temp=array1[j];
                    array1[j]=array1[i];
                    array1[i]=temp;
                }
            }
        }

        for(int i=0;i<array2.length;i++){
            for(int j=1;j<array2.length;j++){
                if(array2[i]>array2[j]){
                    char temp=array2[j];
                    array2[j]=array2[i];
                    array2[i]=temp;
                }
            }
        }
        for(int i=0;i<array1.length;i++){
            if(array1[i]==array2[i]){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]){
        String str1="racet";
        String str2="care";
        System.out.println(check(str1,str2));
    }
}