/*
 * Write a Java program to multiply   two   matrices using multithreading. Divide the task of
multiplying rows of the matrices among multiple threads to improve performance.
 */
package Ques_3;

public class MatMul {
    public static void main(String[] args) {
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] matrix2 = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };
        int[][] result = multiplyMatrices(matrix1, matrix2);
        System.out.println("Result:");
        printMatrix(result);
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length, n = matrix2[0].length, p = matrix2.length;
        int[][] result = new int[m][n];
        Thread[] threads = new Thread[m];
        for (int i = 0; i < m; i++) {
            final int row = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < p; k++) {
                        result[row][j] += matrix1[row][k] * matrix2[k][j];
                    }
                }
            });
            threads[i].start();
        }
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

/*
 * OUTPUT------------------------------------------
 * Result:
 * 30 24 18
 * 84 69 54
 * 138 114 90
 */