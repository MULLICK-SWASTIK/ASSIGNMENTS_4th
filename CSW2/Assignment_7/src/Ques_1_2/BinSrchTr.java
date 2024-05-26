/*
 * Q1. Create a class BSTNode that contains a member 'info' to store a number, with 'left' referring 
to the left child and 'right' referring to the right child. Provide the necessary constructor. 
Additionally, create a method to insert a node into a binary search tree. 
Q2. Write a program to add methods to the binary search tree created in Q1 for traversing the 
tree in pre-order, in-order, and post-order. Invoke the above methods for execution.
 */
package Ques_1_2;

import java.util.*;

public class BinSrchTr {
    TreeNode root = null;

    public TreeNode create(int arr[]) {
        for (int i : arr) {
            root = insert(root, i);
        }
        return root;
    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.info >= val) {
            root.left = insert(root.left, val);
        }
        if (root.info < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.info + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.info + " ");
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.info + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the number of elements in BST:");
        int n = k.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = k.nextInt();
        }
        BinSrchTr obj = new BinSrchTr();
        obj.root = obj.create(arr);
        System.out.println("InOrder--");
        obj.inorder(obj.root);
        System.out.println("\nPreOrder--");
        obj.preorder(obj.root);
        System.out.println("\nPostOrder--");
        obj.postorder(obj.root);
    }
}
/*
 * OUTPUT---------------------------------------------------------------------
 * Enter the number of elements in BST:
 * 6
 * Enter elements :
 * 8 34 7 5 9 1
 * InOrder--
 * 1 5 7 8 9 34
 * PreOrder--
 * 8 7 5 1 34 9
 * PostOrder--
 * 1 5 7 9 34 8
 */