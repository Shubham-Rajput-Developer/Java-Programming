import java.util.*;
public class ClearLast_i_bit{
    public static void main(String[] args) {
        int i=2;
        int ele=15;
        int bitMask=-1<<i;
        System.out.println(ele & bitMask);
    }
}