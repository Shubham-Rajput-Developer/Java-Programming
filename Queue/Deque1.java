import java.util.*;
import java.util.LinkedList;
public class Deque1 {
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(4);
        deque.addLast(2);
        deque.addFirst(3);
        
        System.out.println(deque);
    }
}
