public class StackLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack{
        static Node Head = null;

        //is Empty
        public boolean isEmpty(){
            return Head == null;
        }

        //push
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                Head = newNode;
                return;
            }
            newNode.next = Head;
            Head = newNode;
        }

        //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = Head.data;
            Head = Head.next;
            return top;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = Head.data;
            return top;
        }
    }
    public static void main(String argsp[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
