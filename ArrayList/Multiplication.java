import java.util.ArrayList;

public class Multiplication {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            arr1.add(i*1);
            arr2.add(i*2);
            arr3.add(i*3);
        }

        main.add(arr1);
        main.add(arr2);
        main.add(arr3);
        System.out.println(main);
    }
}
