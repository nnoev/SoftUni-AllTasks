package advanced.multidimensional.arrays.exercises;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        fillMatrix(matrix, scanner);
        int a = getDiagonalA(matrix);
        int b = getDiagonalB(matrix);

        System.out.println(Math.abs(a-b));
    }

    private static int getDiagonalB(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length ; i++) {
                sum += matrix[i][matrix.length-i-1];
            }
        return sum;
    }

    private static int getDiagonalA(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }


}
