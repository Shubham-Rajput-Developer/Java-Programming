import java.util.*;
public class SimplifyPath{
    public static String simplify(String str){
        Stack<String> s = new Stack<>();
        String res = "";
        res += "/";
        String arr[] = str.split("/");

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("..")){
                if(!s.isEmpty())
                    s.pop();
                continue;
            }else if(arr[i].equals(".") || arr[i].equals("")){
                continue;
            }
            s.push(arr[i]);
        }
        Stack<String> s1 = new Stack<>();
        while(!s.isEmpty()){
            s1.push(s.pop());
        }

        while(!s1.isEmpty()){
            if(s1.size() == 1 ){
                res += s1.pop();
            }else{
                res += s1.pop()+"/";
            }
        }
        return res;
    }
    public static void main(String args[]){
        String str1 = "/home/";
        String str2 = "/home//foo/";
        String str3 = "/home/user/Documents/../Pictures";
        String str4 = "/../";
        String str5 = "/.../a/../b/c/../d/./";

        System.out.println(simplify(str1));
        System.out.println(simplify(str2));
        System.out.println(simplify(str3));
        System.out.println(simplify(str4));
        System.out.println(simplify(str5));
        
    }
}