public class QueueUsingLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Queue{
        static Node Head = null;
        static Node Tail = null;

        public  boolean isEmpty(){
            return Head == null && Tail == null;            
        }

        public  void add(int data){
            Node newNode = new Node(data);
            if(Head == null){
                Head = Tail = newNode;
                return;
            }
            Tail.next = newNode;
            Tail = newNode;
        }

        public  int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = Head.data;
            if(Tail==Head){
                Head = Tail = null;
            }else{
                Head = Head.next;
            }
            return front;
        }

        public  int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return Head.data;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
