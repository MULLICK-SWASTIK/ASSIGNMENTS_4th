package Ques_6;

import java.util.ArrayList;
import java.util.List;

public class q6 {
    public static void main(String[] args) {
        List<Object> objList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            objList.add(new Object());
        }
        System.out.println("Timestamp: " + System.currentTimeMillis());
        System.out.println("Heap size: " + Runtime.getRuntime().totalMemory());
        System.out.println("Free space: " + Runtime.getRuntime().freeMemory());
    }
}
