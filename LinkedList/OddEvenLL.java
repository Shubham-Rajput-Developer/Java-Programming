/*Odd Even Linked List
We have a Linked List of integers, write a function to modify the linked list such that all even
numbers appear before all the odd numbers in the modified linked list. Also, keep the order of
even and odd numbers same.*/

public class OddEvenLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node Head;
    
    public void EvenOdd(){
        Node evenHead = null;
        Node evenTail = null;
        Node oddHead = null;
        Node oddTail = null;
        Node curr = Head;
        
        //check it is empty or Single Node
        if(Head == null || Head.next==null){
            return;
        }

        //Split LinkedList into Even and Odd
        while(curr!=null){
            if(curr.data%2==0){ //even
                if(evenHead==null){
                    evenHead = evenTail = curr;
                }else{
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            }
            else{  //odd
                if(oddHead==null){
                    oddHead=oddTail=curr;
                }else{
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }
            curr = curr.next;
        }

        //check no Even number in LL
        if(evenHead==null){
            Head = oddHead;
            return;
        }

        //join both LinkedList
        evenTail.next = oddHead;

        //make last node next is  null
        if(oddTail != null){
            oddTail.next = null;
        }

        //update head
        Head = evenHead;
    }

    public void print(){
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(Head==null){
            Head = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }

    public static void main(String args[]){
        OddEvenLL ll = new OddEvenLL();
        ll.addFirst(6);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(10);
        ll.addFirst(12);
        ll.addFirst(8);

        System.out.println("LinedList Before Changes is : ");
        ll.print();

        ll.EvenOdd();

        System.out.println("LinedList After Changes is : ");
        ll.print();

    }
}
