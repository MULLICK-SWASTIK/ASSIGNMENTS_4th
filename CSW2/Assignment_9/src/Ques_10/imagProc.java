/*
 * Q10. Write a Java program that processes a batch of images concurrently using multiple threads.
Each thread should apply a specific image processing operation (e.g., resizing, filtering) to its
assigned image. Use a thread pool to manage the execution of image processing tasks. Ensure that
each image is processed only once by a single thread to avoid duplication or conflicts.
 */
package Ques_10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class imagProc {
    public static void main(String[] args) {
        List<String> imagePaths = new ArrayList<>();
        imagePaths.add("F:\\GitWork\\CSW2\\Assignment_9\\src\\Ques_10\\image1.png");
        imagePaths.add("F:\\GitWork\\CSW2\\Assignment_9\\src\\Ques_10\\image2.png");
        imagePaths.add("F:\\GitWork\\CSW2\\Assignment_9\\src\\Ques_10\\image3.png");
        int numThreads = 4;
        List<List<String>> imageSegments = divideImageList(imagePaths, numThreads);
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        for (int i = 0; i < numThreads; i++) {
            executor.submit(new ImageProcessingTask(imageSegments.get(i)));
        }
        executor.shutdown();
    }

    private static List<List<String>> divideImageList(List<String> imagePaths, int numThreads) {
        List<List<String>> segments = new ArrayList<>();
        int segmentSize = (int) Math.ceil((double) imagePaths.size() / numThreads);
        for (int i = 0; i < imagePaths.size(); i += segmentSize) {
            segments.add(imagePaths.subList(i, Math.min(i + segmentSize, imagePaths.size())));
        }
        return segments;
    }
}

class ImageProcessingTask implements Runnable {
    private List<String> imagePaths;

    public ImageProcessingTask(List<String> imagePaths) {
        this.imagePaths = imagePaths;
    }

    public void run() {
        for (String imagePath : imagePaths) {
            processImage(imagePath);
        }
    }

    private void processImage(String imagePath) {
        System.out.println("Processing image: " + imagePath);
    }
}
/*
 * OUTPUT-----------------------------------------------
 * 
 */