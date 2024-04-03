package Ques_6;

import java.util.Scanner;

public class numFormExec {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Give input: ");
        try {
            String inp = k.nextLine();
            if (inp == null || inp.isEmpty())
                throw new NullPointerException("Empty input!");
            String inpArr[] = inp.split(" ");
            int len = inpArr.length;
            Double num[] = new Double[len];
            for (int i = 0; i < len; i++)
                num[i] = Double.parseDouble(inpArr[i]);
            for (Double d : num)
                System.out.print(d + " ");
            k.close();
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println(e);
        }
    }
}
//OUTPUT
// Give input: 5 51 2.18 465
// 5.0 51.0 2.18 465.0

// Give input: 45 5.1 7 fs
// java.lang.NumberFormatException: For input string: "fs"

// Give input: 
// java.lang.NullPointerException: Empty input!