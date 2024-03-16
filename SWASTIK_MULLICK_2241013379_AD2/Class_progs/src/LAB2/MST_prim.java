package LAB2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MST_prim{
    public static void main(String[]args){
        int w[][]={{0,8,5,0,0,0,0},{8,0,10,2,20,0,0},{5,10,0,3,0,15,0},{0,2,3,0,12,35,8},{0,20,0,12,0,0,4},{0,0,15,35,0,0,30},{0,0,0,8,4,30,0}};
        ArrayList<ArrayList<Integer>> g=new ArrayList<>();
        g.add(new ArrayList<>(Arrays.asList(1,2)));//0
        g.add(new ArrayList<>(Arrays.asList(0,1,3,4)));//1
        g.add(new ArrayList<>(Arrays.asList(0,1,3,5)));//2
        g.add(new ArrayList<>(Arrays.asList(1,2,4,5,6)));//3
        g.add(new ArrayList<>(Arrays.asList(1,3,6)));//4
        g.add(new ArrayList<>(Arrays.asList(2,3,6)));//5
        g.add(new ArrayList<>(Arrays.asList(3,4,5)));//6
        Vertex v[]=new Vertex[7];
        for(int i=0;i<7;i++){
            v[i]=new Vertex(i, -1, Integer.MAX_VALUE);
        }
        v[0].key=0;
        int u;
        PriorityQueue<Vertex> PQ=new PriorityQueue<>();
        for(int i=0;i<7;i++){
            PQ.add(v[i]);
        }
        while(!PQ.isEmpty()){
            u=PQ.poll().val;
            for(int i : g.get(u)){
                if(PQ.contains(v[i]) && w[u][i]<v[i].key){
                    PQ.remove(v[i]);
                    v[i].π=u;
                    v[i].key=w[u][i];
                    PQ.add(v[i]);
                }
            }
        }

        System.out.println("\nMinimum Spanning tree: \nEdge \t Weight");
        for(int i=1;i<7;i++){
            System.out.println(v[i].π+"--"+i+"\t "+v[i].key);
        }

    }

}

class Vertex implements Comparable<Vertex>{
    int val, π, key;
    public Vertex(int val, int π, int key){
        this.val=val;
        this.π=π;
        this.key=key;
    }

    public int compareTo(Vertex other){
        return this.key-other.key;
    }

}
