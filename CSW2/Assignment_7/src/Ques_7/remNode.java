/*
 * Q7. Remove node x from the binary search tree and reorganize the nodes to maintain its 
necessary properties.   
There are three cases in the deletion process. Let us denote the node that needs to be deleted as 
x: 
Case 1: Node x has no children.  
Case 2: Node x has one child.  
Case 3: Node x has two children.
 */
package Ques_7;

import java.util.Scanner;
import Ques_1_2.*;

public class remNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in BST:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BinSrchTr obj = new BinSrchTr();
        remNode obj1 = new remNode();
        TreeNode root = obj.create(arr);
        System.out.print("Enter Node to delete: ");
        int key = sc.nextInt();
        root = obj1.delete(root, key);
        obj.inorder(root);
    }

    public int min(TreeNode root) {
        if (root == null) {
            return -1;
        }
        TreeNode curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.info;
    }

    public TreeNode delete(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (root.info > key) {
            root.left = delete(root.left, key);
        } else if (root.info < key) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.info = min(root.right);
            root.right = delete(root.right, root.info);
        }
        return root;
    }
}
/*
 * OUTPUT----------------------------------------------
 * Enter the number of elements in BST:
 * 6
 * Enter elements :
 * 5 3 9 1 7 10
 * Enter Node to delete: 1
 * 3 5 7 9 10
 */