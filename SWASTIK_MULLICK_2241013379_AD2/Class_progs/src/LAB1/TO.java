package LAB1;

import java.util.ArrayList;
import java.util.Arrays;

public class TO {
    static ArrayList<ArrayList<Integer>> obj;
    static boolean b[]=new boolean[8];
    static ArrayList<Integer> order;
    public static void main(String[]args){
        obj=new ArrayList<>();
        obj.add(new ArrayList<>(Arrays.asList(1,2,3)));//0
        obj.add(new ArrayList<>(Arrays.asList(4)));//1
        obj.add(new ArrayList<>(Arrays.asList(5)));//2
        obj.add(new ArrayList<>(Arrays.asList(6)));//3
        obj.add(new ArrayList<>(Arrays.asList(7)));//4
        obj.add(new ArrayList<>(Arrays.asList(7)));//5
        obj.add(new ArrayList<>(Arrays.asList(7)));//6
        obj.add(new ArrayList<>(Arrays.asList()));
        order = new ArrayList<>();
        b[0]=true;
        dfs(0);
        for(int i: order){
            System.out.print(i+" ");
        }
    }

    public static void dfs(int i){
        for(int n: obj.get(i)){
            if(!b[n]){
                b[n]=true;
                dfs(n);
            }
        }
        order.add(0,i);
    }

}
