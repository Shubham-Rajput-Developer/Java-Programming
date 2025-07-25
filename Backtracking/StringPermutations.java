public class StringPermutations {
    public static void findPermutaions(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde" => "ab"+"de" => "abde"
            String Newstr = str.substring(0, i)+str.substring(i+1);
            findPermutaions(Newstr, ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findPermutaions(str, "");
    }
}
