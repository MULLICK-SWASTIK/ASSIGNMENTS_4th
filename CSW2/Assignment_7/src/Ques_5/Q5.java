/*
 * Q5. Construct a binary search tree (BST) from the given array of elements: {10, 20, 30, 40, 50, 
60, 70, 80, 90, 100}. Include a method called 'CreateTree' to construct the binary search tree 
from a sorted array. This method takes an array of integers as input and constructs the tree 
recursively using a binary search algorithm.
 */
package Ques_5;

public class Q5 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        Q5 obj = new Q5();
        Node1 root = obj.create(arr, 0, arr.length - 1);
        obj.inorder(root);
    }

    public Node1 create(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node1 curr = new Node1(arr[mid]);
        curr.left = create(arr, start, mid - 1);
        curr.right = create(arr, mid + 1, end);
        return curr;
    }

    public void inorder(Node1 root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}

class Node1 {
    int val;
    Node1 left;
    Node1 right;

    Node1(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
/*
 * OUTPUT---------------------------------------------------------------------
 * 10 20 30 40 50 60 70 80 90 100
 */