import java.util.*;
public class ValidateBST {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(15);
        boolean ans = isValidBST(root);
        if (ans) {
            System.out.print("VALID BST");
        } else {
            System.out.print("INVALID BST");
        }
    }

    public static boolean isValidBST(Node root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean checkBST(Node node, long min, long max) {
        if (node == null) return true;
        if (node.data <= min || node.data >= max) return false;

        if (checkBST(node.left, min, node.data) && checkBST(node.right, node.data, max))
        {
            return true;
        }
        return false;
    }

}
