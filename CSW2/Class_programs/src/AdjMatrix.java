import java.util.Scanner;

public class AdjMatrix {
    private int V;
    private int E;
    private int[][] adj;

    AdjMatrix(int V) {
        this.V = V;
        this.E = 0;
        adj = new int[V][V];
    }

    public void addEdge(int u, int v) {
        adj[u][v]++;
        adj[v][u]++;
        E++;
    }

    public void display() {
        for (int i = 0; i < this.adj.length; i++) {
            for (int j = 0; j < this.adj[0].length; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        // System.out.print("Enter number of vertices: ");
        AdjMatrix A = new AdjMatrix(4);
        A.addEdge(0, 1);
        A.addEdge(0, 3);
        A.addEdge(1, 2);
        A.addEdge(2, 3);
        A.display();
    }
}
