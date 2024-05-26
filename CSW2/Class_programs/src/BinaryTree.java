import java.util.ArrayList;

public class BinaryTree {
    private Node root;

    private static class Node {
        private int value;
        private Node lChild, rChild;

        public Node(int v, Node l, Node r) {
            value = v;
            lChild = l;
            rChild = r;
        }

        public Node(int v) {
            value = v;
            lChild = null;
            rChild = null;
        }
    }

    public BinaryTree() {
        root = null;
    }

    public void CreateBinaryTree(int[] arr) {
        root = CreateBinaryTree(arr, 0, arr.length - 1);
    }

    private Node CreateBinaryTree(int[] arr, int start, int end) {
        Node curr = null;
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        curr = new Node(arr[mid]);
        curr.lChild = CreateBinaryTree(arr, start, mid - 1);
        curr.rChild = CreateBinaryTree(arr, mid + 1, end);
        return curr;
    }

    public void PrintPreOrder() {
        PrintPreOrder(root);
        System.out.println(" ");
    }

    private void PrintPreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            PrintPreOrder(node.lChild);
            PrintPreOrder(node.rChild);
        }
    }

    public void PrintPostOrder() {
        PrintPostOrder(root);
        System.out.println(" ");
    }

    private void PrintPostOrder(Node node) {
        if (node != null) {
            PrintPostOrder(node.lChild);
            PrintPostOrder(node.rChild);
            System.out.print(" " + node.value);
        }
    }

    public void PrintInOrder() {
        PrintInOrder(root);
        System.out.println(" ");
    }

    private void PrintInOrder(Node node) {
        if (node != null) {
            PrintInOrder(node.lChild);
            System.out.println(" " + node.value);
            PrintInOrder(node.rChild);
        }
    }

    public void InsertNode(int value) {
        root = InsertNode(root, value);
    }

    private Node InsertNode(Node node, int value) {
        if (node == null) {
            node = new Node(value, null, null);
        } else {
            if (node.value > value) {
                node.lChild = InsertNode(node.lChild, value);
            } else {
                node.rChild = InsertNode(node.rChild, value);
            }
        }
        return node;
    }

    public Node FindMinNode(Node curr) {
        Node node = curr;
        if (node == null) {
            return null;
        }
        while (node.lChild != null) {
            node = node.lChild;
        }
        return node;
    }

    public Node FindMaxNode(Node curr) {
        Node node = curr;
        if (node == null) {
            return null;
        }
        while (node.rChild != null) {
            node = node.rChild;
        }
        return node;
    }

    public boolean FindVal(int val) {
        Node curr = root;
        while (curr != null) {
            if (curr.value == val) {
                return true;
            } else if (curr.value > val) {
                curr = curr.lChild;
            } else {
                curr = curr.rChild;
            }
        }
        return false;
    }

    public boolean check(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int len = arr.size();
        for(int i=0;i<len-1;i++){
            if(arr.get(i) > arr.get(i+1)){
                return false;
            }
        }
        return true;
    }

public void inorder(Node root, ArrayList<Integer> arr) {
    if (root == null) {
        return;
    }
    inorder(root.lChild, arr);
    arr.add(root.value);
    inorder(root.rChild, arr);
}

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        t.CreateBinaryTree(arr);
        System.out.println("PRE ORDER");
        t.PrintPreOrder();
        System.out.println(t.FindVal(1001));
        t.check(null);
    }
}

// Q. Check whether the given binary tree is a BST or not?
