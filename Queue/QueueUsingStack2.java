import java.util.*;
public class QueueUsingStack2 {
    public static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int front;
        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public void add(int data){
            if(s1.isEmpty()){
                front = data;
            }
            s1.push(data);
        }

        public int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            int res = s2.pop();

            if (!s2.isEmpty()) {
            front = s2.peek();
            }
            
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return res;
        }

        public int peek(){
            if(s1.isEmpty()){
                return -1;
            }
            return front;
        }
    }
    
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
