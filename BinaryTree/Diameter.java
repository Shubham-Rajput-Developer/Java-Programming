package BinaryTree;
public class Diameter {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
    }
    public static int diam(Node root){
        if(root==null){
            return 0;
        }
        int leftDiam = diam(root.left);
        int rightDia = diam(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int selfDiam = leftHeight+rightHeight+1;
        return Math.max(selfDiam, Math.max(rightDia,leftDiam));
    }
  
    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
        public static Info Diameter(Node root){
            if(root==null){
                return new Info(0, 0);
            }
            Info leftInfo = Diameter(root.left);
            Info rightInfo = Diameter(root.right);
            int diam = Math.max(leftInfo.diam,Math.max(rightInfo.diam,leftInfo.ht+rightInfo.ht+1));
            int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;
            return new Info(diam, ht);
        }
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        System.out.println(diam(root));
        
        System.out.println(Info.Diameter(root).diam);
        System.out.println(Info.Diameter(root).ht);
    }   
}
