package advanced.multidimensional.arrays.lab;

import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        int[][] matrixA = new int[rowsA][colsA];
        fillMatrix(matrixA, scanner);
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        int[][] matrixB = new int[rowsB][colsB];
        fillMatrix(matrixB, scanner);
        boolean areEqual = equal(matrixA, matrixB);
        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean equal(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            return false;
        }
        for (int row = 0; row <= matrixA.length - 1; row++) {
            for (int col = 0; col <= matrixA[row].length - 1; col++) {
                if (matrixA[row][col] != matrixB[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void fillMatrix(int[][] matrixA, Scanner scanner) {
        for (int row = 0; row <= matrixA.length - 1; row++) {
            for (int col = 0; col <= matrixA[row].length - 1; col++) {
                matrixA[row][col] = scanner.nextInt();
            }
        }
    }
}
