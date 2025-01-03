public class RemoveDuplicate {
    public static void remove(String str,int idx, StringBuilder newstr,boolean map[])
    {
        if(idx == str.length())
        {
            System.out.println(newstr);
            return;
        }

        char curr = str.charAt(idx);
        if(map[curr-'a']==true)
        {
            remove(str, idx+1, newstr, map);
        }
        else
        {
            map[curr-'a']=true;
            remove(str, idx+1, newstr.append(curr), map);
        }

    }
    public static void main(String args[])
    {
        String str = "shubhamshubhangi";
        boolean map[] = new boolean[26];
        StringBuilder sb = new StringBuilder("");
        remove(str,0,sb,map);
    }
}
