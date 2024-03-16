package LAB2;

import java.util.ArrayList;
import java.util.Arrays;

public class MST_kruskal {
    public static void main(String[] aggs) {
        Edge e[] = new Edge[12];
        e[0] = new Edge(0, 1, 8);
        e[1] = new Edge(0, 2, 5);
        e[2] = new Edge(1, 2, 10);
        e[3] = new Edge(1, 3, 2);
        e[4] = new Edge(1, 4, 20);
        e[5] = new Edge(2, 3, 3);
        e[6] = new Edge(2, 5, 15);
        e[7] = new Edge(3, 4, 12);
        e[8] = new Edge(3, 5, 35);
        e[9] = new Edge(3, 6, 8);
        e[10] = new Edge(4, 6, 4);
        e[11] = new Edge(5, 6, 30);

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        Arrays.sort(e);
        for (int i = 0; i < 12; i++) {
            al.add(new ArrayList<>(Arrays.asList(i)));
        }
        System.out.println("Edges in minimum spanning tree:");
        for (int i = 0; i < 12; i++) {
            int find_u = find(e[i].u, al), find_v = find(e[i].v, al);
            if (find_u != find_v) {
                System.out.println(e[i].u + "--" + e[i].v);
                al.get(find_u).addAll(al.get(find_v));
                al.get(find_v).clear();
            }
        }

    }

    public static int find(int u, ArrayList<ArrayList<Integer>> al) {
        for (int i = 0; i < 12; i++) {
            if (al.get(i).contains(u)) {
                return i;
            }
        }
        return -1;
    }
}

class Edge implements Comparable<Edge> {
    int u, v, weight;

    Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}