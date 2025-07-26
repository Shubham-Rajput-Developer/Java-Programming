import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(90);
        list.add(4);
        list.add(10);
        list.add(1);

        System.out.println(list);

        int idx1 = 3;
        int idx2 = 1;
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
