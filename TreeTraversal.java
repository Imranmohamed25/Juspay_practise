import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void preorder(Node root){

        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
        return;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
        return;
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
        return;
    }

    public static void levelorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node newNode = q.poll();
            System.out.print(newNode.data + " ");
            if (newNode.left != null){
                q.add(newNode.left);
            }
            if(newNode.right != null){
                q.add(newNode.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print("PreOrder: ");
        preorder(root);
        System.out.print("\nInOrder: ");
        inorder(root);
        System.out.print("\nPostOrder: ");
        postorder(root);
        System.out.print("\nLevelOrder: ");
        levelorder(root);
    }

}
