package LAB7;

import java.util.*;

public class Interval_Scheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of jobs");
        int n = sc.nextInt();
        Job arr[] = new Job[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item no.: ");
            int item = sc.nextInt();
            System.out.println("Enter start and end time: ");
            arr[i] = new Job(item, sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr);
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(arr[0].item);
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i].finish <= arr[j].start) {
                ob.add(arr[j].item);
                i = j;
            }
        }
        System.out.println("Scheduled items: " + ob);
    }
}

class Job implements Comparable<Job> {
    int item;
    int start;
    int finish;

    Job(int item, int start, int finish) {
        this.item = item;
        this.start = start;
        this.finish = finish;
    }

    public int compareTo(Job obj) {
        return this.finish - obj.finish;
    }
}
