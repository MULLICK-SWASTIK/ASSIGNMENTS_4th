/*
 Name:Anish More
 Registraion Number: 2241013365
 Name of program:Create of Binary search tree and perform inorder, preorder and postorder traversal.
 */

 import java.lang.reflect.Array;
 import java.util.ArrayList;
 import java.util.Scanner;
 
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
 
     public TreeNode(int val) {
         this.val = val;
         this.left = null;
         this.right = null;
     }
 }
 
 public class abc {
     TreeNode root = null;
 
     public TreeNode create(int arr[], int start, int end) {
         if (start > end) {
             return null;
         }
         int mid = (start + end) / 2;
         TreeNode curr = new TreeNode(arr[mid]);
         curr.left = create(arr, start, mid - 1);
         curr.right = create(arr, mid + 1, end);
         return curr;
     }
 
     public TreeNode insert(TreeNode root, int val) {
         if (root == null) {
             return new TreeNode(val);
         }
         if (root.val >= val) {
             root.left = insert(root.left, val);
         }
         if (root.val < val) {
             root.right = insert(root.right, val);
         }
         return root;
     }
 
     public boolean find(TreeNode root, int value) {
         if (root == null) {
             return false;
         }
         if (root.val == value) {
             return true;
         }
         if (root.val > value) {
             return find(root.left, value);
         }
         return find(root.right, value);
     }
 
     public void preorder(TreeNode root) {
         if (root == null) {
             return;
         }
         System.out.print(root.val + " ");
         preorder(root.left);
         preorder(root.right);
     }
 
     public void postorder(TreeNode root) {
         if (root == null) {
             return;
         }
         postorder(root.left);
         postorder(root.right);
         System.out.print(root.val + " ");
     }
 
     public void inorder(TreeNode root) {
         if (root == null) {
             return;
         }
         inorder(root.left);
         System.out.print(root.val + " ");
         inorder(root.right);
     }
 
     public void inorder(TreeNode root, ArrayList<Integer> arr) {
         if (root == null) {
             return;
         }
         inorder(root.left, arr);
         arr.add(root.val);
         inorder(root.right, arr);
     }
 
     public int min(TreeNode root) {
         if (root == null) {
             return -1;
         }
         TreeNode curr = root;
         while (curr.left != null) {
             curr = curr.left;
         }
         return curr.val;
     }
 
     public int max(TreeNode root) {
         if (root == null) {
             return -1;
         }
         TreeNode curr = root;
         while (curr.right != null) {
             curr = curr.right;
         }
         return curr.val;
     }
 
     public boolean check(TreeNode root) {
         ArrayList<Integer> arr = new ArrayList<>();
         inorder(root, arr);
         int len = arr.size();
         for (int i = 0; i < len - 1; i++) {
             if (arr.get(i) > arr.get(i + 1)) {
                 return false;
             }
         }
         return true;
     }
 
     public TreeNode delete(TreeNode root, int key) {
         if (root == null) {
             return root;
         }
         if (root.val > key) {
             root.left = delete(root.left, key);
         } else if (root.val < key) {
             root.right = delete(root.right, key);
         } else {
             if (root.left == null) {
                 return root.right;
             } else if (root.right == null) {
                 return root.left;
             }
             root.val = min(root.right);
             root.right = delete(root.right, root.val);
         }
         return root;
     }
     public int leafNodes(TreeNode root){
         if(root==null){
             return 0;
         }
         if(root.left==null && root.right==null){
             return 1;
         }
         return leafNodes(root.left)+leafNodes(root.right);
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of elements in BST:");
         int n = sc.nextInt();
         int arr[] = new int[n];
         System.out.println("Enter elements : ");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         abc obj = new abc();
         obj.root = obj.create(arr, 0, n - 1);
         // System.out.println("InOrder--");
         // obj.inorder(obj.root);
         // System.out.println("\nPreOrder--");
         // obj.preorder(obj.root);
         // System.out.println("\nPostOrder--");
         // obj.postorder(obj.root);
         // System.out.println("\nMinimum element in BST:" + obj.min(obj.root));
         // System.out.println("Maximum element in BST:" + obj.max(obj.root));
         // System.out.println(obj.find(obj.root, 50) ? "Element found" : "Element not
         // found");
         System.out.println(obj.check(obj.root) ? "BST is valid" : "BST is not valid");
         obj.root=obj.delete(obj.root, 50);
         obj.inorder(obj.root);
         System.out.println("\nNumber of leaf nodes in BST:"+obj.leafNodes(obj.root));
     }
 }
 