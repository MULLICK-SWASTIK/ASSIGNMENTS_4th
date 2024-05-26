import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjList {
    private int V;
    private int E;
    private LinkedList<Integer>[] adj;

    public AdjList(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    // public void display(){
    // for(int i=0;i<this.adj.length;i++){
    // System.out.print(i+": ");
    // w
    // }
    // }

    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices," + E + " edges\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);
        System.out.print("BFS: ");
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        st.push(s);
        System.out.print("DFS: ");
        while (!st.isEmpty()) {
            int u = st.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        st.push(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        AdjList A = new AdjList(5);
        A.addEdge(0, 1);
        A.addEdge(0, 3);
        A.addEdge(1, 2);
        A.addEdge(2, 3);
        A.addEdge(2, 4);
        A.display();
        A.bfs(0);
        A.dfs(0);
    }
}
