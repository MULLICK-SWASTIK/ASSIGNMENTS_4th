package LAB1;

import java.util.ArrayList;
import java.util.Arrays;

public class DFS {
    static ArrayList<ArrayList<Integer>> ob;
    static boolean b[]=new boolean[8];
    public static void main(String[]args){
        ob=new ArrayList<>();
        ob.add(new ArrayList<>(Arrays.asList(1,2,3)));
        ob.add(new ArrayList<>(Arrays.asList(0,4)));
        ob.add(new ArrayList<>(Arrays.asList(0,5)));
        ob.add(new ArrayList<>(Arrays.asList(0,6)));
        ob.add(new ArrayList<>(Arrays.asList(1,7)));
        ob.add(new ArrayList<>(Arrays.asList(2,7)));
        ob.add(new ArrayList<>(Arrays.asList(3,7)));
        ob.add(new ArrayList<>(Arrays.asList(4,5,6)));
        
        b[0]=true;
        dfs(0);
    }

    public static void dfs(int i){
        System.out.print(i+" ");
        for(int n: ob.get(i)){
            if(!b[n]){
                b[n]=true;
                dfs(n);
            }
        }
    }

}
