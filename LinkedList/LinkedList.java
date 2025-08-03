public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data){
        //step 1 - create new node 
        Node newNode = new Node(data);
        size++;
        //if Linked list is empty
        if(Head==null){
            Head = Tail = newNode;
            return;
        }

        //step 2 - newNode next = Head
        newNode.next = Head;
        
        //step 3 - Head = newNode
        Head = newNode;
    }

    public void addLast(int data){
        //step 1 - create new node
        Node newNode = new Node(data);
        size++;
        //if LinkedList is empty
        if(Head == null){
            Head = Tail = newNode;
            return;
        }

        //step 2 - tail.next = newNode
        Tail.next = newNode;

        //step 3 - tail = newNode
        Tail = newNode;
    }

    public void addMiddle(int idx,int data){
        //if add first means idx =0
        if(idx==0){
            addFirst(data);
            return;
        }
         
        //Create New Node
        Node newNode = new Node(data);
        size++;
        //Create temp node
        Node temp = Head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        
        //temp == prev , i==idx-1
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print(){
        if(Head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = Head.data;
            Head = Tail = null;
            size=0;
            return val;
        }
        int val = Head.data;
        Head = Head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }

        //if i=size-2
        Node prev = Head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }

        //if i prev
        int val = prev.next.data;
        prev.next = null;
        Tail = prev;
        size--;
        return val; 
    }

    public int itrSearch(int key){
        Node temp = Head;
        int idx = 0;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    //Recursive search
    public int helper(int key, Node Head){
        if(Head == null){
            return -1;
        }
        if(Head.data == key){
            return 0;
        }

        int idx = helper(key, Head.next);
        if(idx==-1){
            return -1;
        }
        //return value is 0 so add 1 to make it correct and return
        return idx+1;
    }
    public int recSearch(int key){
        return helper(key, Head);
    }

    public void reverse(){
        Node prev = null;
        Node curr = Tail = Head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Head = prev;
    }

    public void deleteNthFromEnd(int N){
        //calculate size
        int sz = 0;
        Node temp = Head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(N==sz){
            Head = Head.next; //remove first
            return;
        }

        //sz-n
        int i=1;
        int idxToFind = sz-N;
        Node prev = Head;
        while(i<idxToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //mid of LinkedList
    public Node findMid(Node Head){
        Node fast = Head;
        Node slow = Head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        //base case
        if(Head == null || Head.next == null){
            return true;
        }

        //step 1 - find mid
        Node Mid = findMid(Head);

        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = Mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node RightHead = prev;

        //step 3 - compare 1st half and 2nd half
        Node LeftHead = Head;
        while(RightHead!=null){
            if(LeftHead.data!=RightHead.data){
                return false;
            }
            LeftHead = LeftHead.next;
            RightHead = RightHead.next;
        }
        return true;
    }

    //cycle detect
    public static boolean isCycle(){
        Node fast = Head;
        Node slow = Head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        //detect cycle
        Node fast = Head;
        Node slow = Head;
        boolean cycle = false;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                cycle = true;
                break;
            }
        }

        if(cycle==false){
            return ;
        }

        //find meetting point
        slow = Head;
        Node prev = null;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle 
        prev.next = null;
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        //ll.addMiddle(2, 9);
        //ll.print();
        // ll.removeFirst();
        //ll.print();
        //ll.removeLast();
        //ll.print();
        // System.out.println("Size of LinkedList : "+size);
        // System.out.println("Key found at : "+ll.recSearch(3));
        // System.out.println("Key found at : "+ll.recSearch(10));
        // ll.reverse();
        // ll.print();   
        //ll.deleteNthFromEnd(3);
        //ll.print();
        //System.out.println("Is LinkedList is Palindrome : "+ll.checkPalindrome());
        Head = new Node(1);
        Node temp = new Node(2);
        Head.next = temp;
        Head.next.next = new Node(3);
        Head.next.next.next = new Node(4);
        Head.next.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }
}