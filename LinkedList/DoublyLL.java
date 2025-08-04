public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(Head == null ){
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head.prev = newNode;
        Head = newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(Head == null){
            Head = Tail = newNode;
            return;
        }

        Node temp = Head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev=temp;
        Tail = newNode;
    }
    public int removeFirst(){
         if(Head == null){
            System.out.println("Doubly LinkedList is Empty");
            return Integer.MIN_VALUE;
         }
         if(size==1){
            int val = Head.data;
            Head = Tail = null;
            size--;
            return val;
         }
         int val = Head.data;
         Head = Head.next;
         Head.prev = null;
         size--;
         return val;

    }
    public int removeLast(){
        if(Head == null){
            System.out.println("Doubly LinkedList is Empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = Head.data;
            Head = Tail = null;
            size--;
            return val;
        }
        Node temp = Head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next.prev = null;
        temp.next = null;
        Tail = temp;
        size--;
        return val;
    }

    public void reverseDLL(){
        Node curr = Head;
        Node Prev = null;
        Node Next;
        while(curr!=null){
            Next = curr.next;
            curr.next = Prev;
            curr.prev = Next;
            Prev = curr;
            curr = Next;
        }
        Head = Prev;
    }
    public void print(){
        Node temp = Head;
        System.out.print("null<-");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        DoublyLL DLL = new DoublyLL();
        DLL.addFirst(2);
        DLL.addFirst(3);
        DLL.addFirst(4);
        DLL.addLast(1);
        DLL.print();
        // System.out.println("Size of Doubly LinkedList is : "+size);
        // DLL.removeFirst();
        // DLL.print();
        // System.out.println("Size of Doubly LinkedList is : "+size);
        // DLL.removeLast();
        // DLL.print();
        //System.out.println("Size of Doubly LinkedList is : "+size);
        DLL.reverseDLL();
        DLL.print();

    }
}
