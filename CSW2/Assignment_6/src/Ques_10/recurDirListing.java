/*
 * Recursive Directory Listing: Write a Java program that recursively lists all files and subdirectories within a given directory.
The program should prompt the user for the directory path and then display a structured list of all contents, including files
and directories nested within any subdirectories.
 */
package Ques_10;

import java.util.Scanner;
import java.io.File;

public class recurDirListing {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter directory path: ");
        String Dir = k.nextLine();
        File file = new File(Dir);
        listFiles(file);
    }

    public static void listFiles(File file) {
        if (file.isFile())
            System.out.println(file.getName());
        else if (file.isDirectory()) {
            System.out.println(file.getName() + " (Directory)");
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    listFiles(f);
                }
            }
        }
    }
}
/*
 * OUTPUT-------------------------------------------------------------------
 * Enter directory path:
 * F:\GITWORK\CSW2\Assignment_6
 * Assignment_6 (Directory)
 * src (Directory)
 * App.java
 * Ques_1 (Directory)
 * FileWri.java
 * diary.txt
 * Ques_2 (Directory)
 * FileRead.java
 * Ques_3 (Directory)
 * FileAppen.java
 * diary.txt
 * Ques_4 (Directory)
 * dirFiles.java
 * Ques_5 (Directory)
 * dirFilesFilter.java
 * Ques_6 (Directory)
 * delSpecific.java
 * Ques_7 (Directory)
 * copyFileCont.java
 * CopiedFile.txt
 * Ques_8 (Directory)
 * fileRename.java
 * xyz.txt
 * Ques_9 (Directory)
 * fileMetaData.java
 * Ques_10 (Directory)
 * recurDirListing.java
 * README.md
 * .vscode (Directory)
 * settings.json
 * lib (Directory)
 */