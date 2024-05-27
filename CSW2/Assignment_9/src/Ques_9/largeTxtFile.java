/*
 * Q9. Write a Java program that processes  a large text file using multiple threads. Each thread
should read a portion of the file, process it (e.g., count words, find specific patterns), and then
merge the results to get the final output. The program should use a thread-safe data structure (e.g.,
ConcurrentHashMap)   to   store   intermediate   results   from   each   thread.   Use   synchronization
mechanisms to ensure that each thread processes a unique portion of the file.
 */
package Ques_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class largeTxtFile {
    public static void main(String[] args) {
        String filePath = "F:\\GitWork\\CSW2\\Assignment_9\\src\\Ques_9\\large_text_file.txt";
        int numThreads = 4;
        Map<String, Integer> resultMap = new ConcurrentHashMap<>();
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new FileProcessor(filePath, numThreads, i, resultMap));
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int totalWordCount = 0;
        for (int count : resultMap.values()) {
            totalWordCount += count;
        }
        System.out.println("Total word count: " + totalWordCount);
    }
}

class FileProcessor implements Runnable {
    private String filePath;
    private int numThreads;
    private int threadIndex;
    private Map<String, Integer> resultMap;

    public FileProcessor(String filePath, int numThreads, int threadIndex, Map<String, Integer> resultMap) {
        this.filePath = filePath;
        this.numThreads = numThreads;
        this.threadIndex = threadIndex;
        this.resultMap = resultMap;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int lineNumber = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                if (lineNumber % numThreads == threadIndex) {
                    processLine(line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processLine(String line) {
        String[] words = line.split("\\s+");
        for (String word : words) {
            resultMap.merge(word, 1, Integer::sum);
        }
    }
}
/*
 * OUTPUT--------------------------------------------------------------
 * Total word count: 1081
 */