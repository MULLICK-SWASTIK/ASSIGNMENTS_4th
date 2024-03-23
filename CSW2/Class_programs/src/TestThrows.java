import java.io.*;
// import java.util.*;

public class TestThrows {
    public static void main(String[]args){
        ReadWrite rw=new ReadWrite();
        try{
            rw.readFile();
        }catch(FileNotFoundException e){
            // System.out.println(e);
            e.printStackTrace();
        }
        try{
            rw.saveFile();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Hello!!");
    }
}

class ReadWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:/abc.txt");
    }

    void saveFile() throws FileNotFoundException {
        String text="This is Demo";
        FileOutputStream fos=new FileOutputStream("D:/xyz.txt");
    }
}
