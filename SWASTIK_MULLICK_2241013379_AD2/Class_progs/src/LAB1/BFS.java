package LAB1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class BFS{
    public static void main(String[]args){
        ArrayList<ArrayList<Integer>> ob=new ArrayList<>();
        ob.add(new ArrayList<>(Arrays.asList(1,2,3)));
        ob.add(new ArrayList<>(Arrays.asList(0,4)));
        ob.add(new ArrayList<>(Arrays.asList(0,5)));
        ob.add(new ArrayList<>(Arrays.asList(0,6)));
        ob.add(new ArrayList<>(Arrays.asList(1,7)));
        ob.add(new ArrayList<>(Arrays.asList(2,7)));
        ob.add(new ArrayList<>(Arrays.asList(3,7)));
        ob.add(new ArrayList<>(Arrays.asList(4,5,6)));
        Queue<Integer> q=new LinkedList<>();
        boolean b[]=new boolean[8];
        q.offer(0);
        b[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" ");
            for(int i: ob.get(node)) {
                if (!b[i]) {
                    q.offer(i);
                    b[i]=true;
                }
            }
        }
    }
}