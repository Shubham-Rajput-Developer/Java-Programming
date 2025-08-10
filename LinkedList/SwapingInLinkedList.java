
public class SwapingInLinkedList {
    
    public static class Node{
        int data; 
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        static public Node Head;
        static public Node Tail;
        static public int size;      

    public void swapNodes(int x, int y){
        if (x == y)
            return;
        
        //for x , find prevx and currx
        Node prevX = null, currX = Head;
        while (currX != null && currX.data != x) {
        prevX = currX;
        currX = currX.next;
        }

        //for y, find prevy and curry
        Node prevY = null, currY = Head;
        while (currY != null && currY.data != y) {
        prevY = currY;
        currY = currY.next;
        }

        //if x and y not found , do nothing
        if (currX == null || currY == null)
        return;

        //linking prevx to curry and prevy to currx
        if (prevX != null)
            prevX.next = currY;
        else
            Head = currY;
        if (prevY != null)
            prevY.next = currX;
        else
            Head = currX;
        
        //Swap
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public  void add(int data){
        Node newNode = new Node(data);
        newNode.next = Head;
        Head = newNode;
    }
    public void print(){
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        SwapingInLinkedList ll = new SwapingInLinkedList();
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);

        System.out.println("LL Before Swappinng");
        ll.print();

        ll.swapNodes(2, 4);

        System.out.println("LL After Swappinng");
        ll.print();
    }
}
