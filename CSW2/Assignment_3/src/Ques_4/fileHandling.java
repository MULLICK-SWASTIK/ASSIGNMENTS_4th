package Ques_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileNotFoundException extends Exception {
    public FileNotFoundException(String message) {
        super(message);
    }
}

class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String message) {
        super(message);
    }
}

public class fileHandling {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main <file_path>");
            return;
        }

        String filePath = "F:\\a1q1.java";
        try {
            readAndPrintFileContents(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Custom FileNotFoundException: " + e.getMessage());
        } catch (FileReadPermissionException e) {
            System.out.println("Custom FileReadPermissionException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void readAndPrintFileContents(String filePath)
            throws FileNotFoundException, FileReadPermissionException, IOException {
        if (filePath == null || filePath.isEmpty()) {
            throw new FileNotFoundException("File path is null or empty.");
        }

        java.io.File file = new java.io.File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File does not exist: " + filePath);
        }

        if (!file.canRead()) {
            throw new FileReadPermissionException("Cannot read file due to permission issues: " + filePath);
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
