package Ques_21;

public class matrixOp {
    public static void main(String[] args) {
        int mat1[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int mat2[][] = {
                { 11, 22, 33 },
                { 44, 55, 66 },
                { 77, 88, 99 }
        };
        display(mat1, "A ");
        display(mat2, "B ");
        try {
            int matAdd[][] = matrix_Add(mat1, mat2);
            display(matAdd, "Addition");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            int matMul[][] = matrix_Multiply(mat1, mat2);
            display(matMul, "Multiplication");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            int transpose1[][] = transpose(mat1);
            display(transpose1, "T(A)");
            int transpose2[][] = transpose(mat2);
            display(transpose2, "T(B)");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void display(int[][] matrix, String str) {
        System.out.println(String.format("%1$s Matrix :", str));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] matrix_Add(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            throw new IllegalArgumentException("Unequal rows or columns");
        }
        int result[][] = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    public static int[][] matrix_Multiply(int[][] mat1, int[][] mat2) {
        if (mat1[0].length != mat2.length) {
            throw new IllegalArgumentException("Rows and columns incompatible for matrix multiplcation");
        }
        int result[][] = new int[mat1.length][mat2[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                for (int k = 0; k < mat1[0].length; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transpose(int[][] matrix) {
        int result[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

}
// OUTPUT
/*
 * A Matrix :
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * B Matrix :
 * 11 22 33
 * 44 55 66
 * 77 88 99
 * 
 * Addition Matrix :
 * 12 24 36
 * 48 60 72
 * 84 96 108
 * 
 * Multiplication Matrix :
 * 330 396 462
 * 726 891 1056
 * 1122 1386 1650
 * 
 * T(A) Matrix :
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * 
 * T(B) Matrix :
 * 11 44 77
 * 22 55 88
 * 33 66 99
 */