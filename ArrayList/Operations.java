import java.util.ArrayList;

public class Operations {
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
       
        //add element
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);

        //Get operations
        int element = list1.get(2);
        System.out.println(element);


        //Remove element
        list1.remove(2);
        System.out.println(list1);

        //Set element at index
        list1.set(2,10);
        System.out.println(list1);

        //Contains
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(3));

        //add anywhere
        list1.add(1,40);
        System.out.println(list1);

        //Size of ArrayList
        System.out.println(list1.size());

        //Print arraylist
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
    }
}
