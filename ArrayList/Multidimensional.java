import java.util.ArrayList;

public class Multidimensional {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        mainList.add(arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(4);
        arr2.add(6);
        arr2.add(8);
        mainList.add(arr2);
        //System.out.println(mainList);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> current = mainList.get(i);
            for(int j=0;j<current.size();j++){
                System.out.print(current.get(j)+" ");
            }
            System.out.println();
        }
    }
}
