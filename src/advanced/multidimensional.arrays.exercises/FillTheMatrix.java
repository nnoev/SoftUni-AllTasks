package advanced.multidimensional.arrays.exercises;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String method = input[1];
        int[][] matrix = new int[n][n];
        if (method.equals("A")) {
            matrix = fillMatrixA(matrix);
            printMatrix(matrix);
        }
        if (method.equals("B")) {
            matrix = fillMatrixB(matrix);
            printMatrix(matrix);
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrixB(int[][] matrix) {
        int number = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = number;
                    number++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = number;
                    number++;
                }
            }
        }
        return matrix;
    }

    private static int[][] fillMatrixA(int[][] matrix) {
        int number = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = number;
                number++;
            }
        }
        return matrix;
    }
}