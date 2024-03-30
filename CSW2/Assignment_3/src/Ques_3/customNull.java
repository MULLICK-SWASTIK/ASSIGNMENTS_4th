package Ques_3;

import java.util.Scanner;

public class customNull {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Give input: ");
        String str = k.nextLine();
        try {
            if (str == null || str.isEmpty())
                throw new CustomNullPointerException("Input is null");
            else
                System.out.println("\nUser input: "+str);
        } catch (CustomNullPointerException e) {
            System.out.println("<┘\n" + e);
        }
        k.close();
        System.out.println("\nEOF");
    }
}

class CustomNullPointerException extends NullPointerException {
    CustomNullPointerException(String msg) {
        super(msg);
    }
}
//OUTPUT
// *Give input: sdkfjsdlf

// User input: sdkfjsdlf

// EOF


// *Give input: 
// <┘
// Ques_3.CustomNullPointerException: Input is null

// EOF