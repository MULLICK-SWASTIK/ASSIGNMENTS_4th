/*
 * Q7. Implement a Java program that demonstrates the use of  CompletableFuture  to perform
asynchronous tasks and handle their results. Create CompletableFuture instances to perform tasks
such as fetching data from a remote server or processing a large file asynchronously. Use
thenApply() or thenCombine() to combine the results.
 */
package Ques_7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class compFut {
    public static void main(String[] args) {
        CompletableFuture<String> fetchDataFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching data from remote server...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Data from remote server";
        });
        CompletableFuture<String> processFileFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Processing large file...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Processed data from file";
        });
        CompletableFuture<String> combinedResultFuture = fetchDataFuture.thenCombine(processFileFuture,
                (dataFromServer, dataFromFile) -> {
                    return "Combined result: " + dataFromServer + " + " + dataFromFile;
                });
        try {
            String combinedResult = combinedResultFuture.get();
            System.out.println(combinedResult);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
 * OUTPUT----------------------------------------------------------------------
 * Fetching data from remote server...
 * Processing large file...
 * Combined result: Data from remote server + Processed data from file
 */