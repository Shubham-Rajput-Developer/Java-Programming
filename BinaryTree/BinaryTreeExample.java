package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeExample {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(idx>=nodes.length){
                return null;
            }

            if(nodes[idx]==-1){
                return null;
            }

            Node  newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void  levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curNode = q.remove();
                if(curNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break; 
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curNode.data+" ");
                    if(curNode.left!=null){
                        q.add(curNode.left);
                    }
                    if(curNode.right!=null){
                        q.add(curNode.right);
                    }
                }
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

        public static int count(Node root){
            if(null==root){
                return 0;
            }
            int lcount = count(root.left);
            int rcount = count(root.right);
            return lcount+rcount+1;
        }

        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            int treeSum = leftSum+rightSum+root.data;
            return treeSum;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        
        System.out.println("PreorderTraversal");
        tree.preorder(root);
        System.out.println("\nInorder Traversal");
        tree.inorder(root);
        System.out.println("\nPostorder Traversal");
        tree.postorder(root);
        System.out.println("\nLevel order Traversal");
        tree.levelorder(root);
        System.out.println("Height of Tree is : "+tree.height(root));
        System.out.println("Count of Node : "+tree.count(root));
    }
}
