// /*
//  * Q2. Write a Java program that uses reactive programming to read a file asynchronously. Use RxJava
// or another reactive library to handle the file reading and processing.
//  */
// package Ques_2;

// import io.reactivex.rxjava3.core.Flowable;
// import io.reactivex.rxjava3.schedulers.Schedulers;
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.concurrent.TimeUnit;

// public class reactProgFR {
//     public static void main(String[] args) {
//         String filePath = "example.txt";
//         Flowable.fromCallable(() -> readLinesFromFile(filePath))
//                 .subscribeOn(Schedulers.io())
//                 .flatMapIterable(lines -> lines)
//                 .observeOn(Schedulers.computation())
//                 .subscribe(
//                         line -> {
//                             System.out.println("Processing line: " + line);
//                             // Simulate some processing time
//                             try {
//                                 TimeUnit.SECONDS.sleep(1);
//                             } catch (InterruptedException e) {
//                                 Thread.currentThread().interrupt();
//                             }
//                         },
//                         throwable -> {
//                             System.err.println("Error processing file: " + throwable.getMessage());
//                             throwable.printStackTrace();
//                         },
//                         () -> System.out.println("File processing completed"));
//     }

//     private static String[] readLinesFromFile(String filePath) {
//         try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//             return reader.lines().toArray(String[]::new);
//         } catch (IOException e) {
//             System.err.println("Error reading file: " + e.getMessage());
//             throw new RuntimeException("Error reading file: " + e.getMessage(), e);
//         }
//     }
// }
// /*
//  * OUTPUT-------------------------------------------------------------
//  * 
//  */