/*
 * Q8. Write a program to implement the graph  using adjacency matrix  representation  and 
adjacency list representation. Create methods to display the adjacency matrix and adjacency 
list of the graph. 
 
Q9. Create  a  class Graph with a linked list member to  represent N number of vertices. 
Implement the required constructor. Add a method to the Graph class for reading a graph and 
storing it in an adjacency list representation.  
Include a depth-first search (DFS) method in the Graph class to traverse the vertices of the 
graph, and a main method to invoke all the methods. 
 
Q10. Write a Java program to traverse a graph using breadth-first search (BFS) and provide 
the final output of the code. (Use the ArrayDeque collection.)
 */
package Ques_8_9_10;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class AdjDfsBfs {
    private int v;
    private LinkedList<Integer>[] adj;
    private int[][] adj1;
    boolean visited[];

    AdjDfsBfs(int v) {
        this.v = v;
        this.adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        adj1 = new int[v][v];
        visited = new boolean[v];
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        AdjDfsBfs a = new AdjDfsBfs(5);
        System.out.println("Enter number of edges: ");
        int n = k.nextInt();
        for (int i = 0; i < n; i++)
            a.addEdge(k.nextInt(), k.nextInt());
        a.display();
        System.out.println("DFS Traversal: ");
        a.dfs(0);
        a.visited[0] = true;
        System.out.println("\nBFS Traversal: ");
        a.visited = new boolean[n];
        a.bfs(0);
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        adj1[u][v] = 1;
        adj1[v][u] = 1;
    }

    public void display() {
        System.out.println("Adjacency list: ");
        for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Adjacency Matrix: ");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(adj1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dfs(int s) {
        Stack<Integer> q = new Stack<>();
        q.push(s);
        while (!q.isEmpty()) {
            int u = q.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        q.push(v);
                    }
                }
            }
        }
    }

    public void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    q.offer(v);
                    visited[v] = true;
                }
            }
        }
    }
}
/*
 * OUTPUT---------------------------------------------------
 * 
 */