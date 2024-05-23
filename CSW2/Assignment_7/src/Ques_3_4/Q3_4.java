/*
 * Q3.  Create  a  class  Country  containing  members  for  name  and  population,  along  with  a 
constructor and necessary methods. Additionally, create a class BNode with a member 'info' to 
store a country object, 'left' to refer to the left child, and 'right' to refer to the right child. Provide 
the required constructor. Finally, create another class BST with a member 'root', along with the 
necessary constructor and a method to insert a node into the binary search tree. 
 
Q4. Extend the BST created in Q3 by adding methods to traverse the tree in level order, find 
the node with the maximum population (find-max), and find the node with the minimum 
population (find-min). Invoke these methods for execution.
 */
package Ques_3_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q3_4 {
    Node root;
    static Scanner sc = new Scanner(System.in);

    Q3_4(Node root) {
        this.root = root;
    }

    public static void main(String[] args) {
        Q3_4 obj = new Q3_4(null);
        System.out.println("Enter the number of countries");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            obj.root = obj.insert(obj.root, new Country(sc.next(), sc.nextInt()));
        }
        System.out.println("Level Order Traversal");
        obj.levelOrder(obj.root);
        System.out.println("Country with maximum population: " + obj.max(obj.root));
        System.out.println("Country with minimum population: " + obj.min(obj.root));
    }

    public Node insert(Node root, Country val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.info.compareTo(val) > 0) {
            root.left = insert(root.left, val);
        }
        if (root.info.compareTo(val) < 0) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.println(temp.info);
            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }
        }
    }

    public String max(Node root) {
        if (root.right == null) {
            return root.info.name;
        }
        return max(root.right);
    }

    public String min(Node root) {
        if (root.left == null) {
            return root.info.name;
        }
        return min(root.left);
    }
}

class Country implements Comparable<Country> {
    String name;
    int population;

    Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public int compareTo(Country obj) {
        return this.population - obj.population;
    }

    public String toString() {
        return name + " " + population;
    }
}

class Node {
    Country info;
    Node left;
    Node right;

    Node(Country info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }

}
/*
 * OUTPUT-------------------------------------------------------------
 * Enter the number of countries
 * 5
 * AB 100
 * CD 200
 * EF 300
 * GH 400
 * IJ 500
 * Level Order Traversal
 * AB 100
 * CD 200
 * EF 300
 * GH 400
 * IJ 500
 * Country with maximum population: IJ
 * Country with minimum population: AB
 */