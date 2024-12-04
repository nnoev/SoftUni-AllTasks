package multidimensional.arrays.exercises;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int sum = Integer.MIN_VALUE;
        fillMatrix(matrix, scanner);
        int startRow =0;
        int startCol =0;
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int currentSum = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        currentSum += matrix[k][l];
                        if (currentSum > sum) {
                            sum = currentSum;
                            startRow = i;
                            startCol = j;
                        }
                    }
                }
            }
        }
        System.out.printf("Sum = %d\n",sum);
        printMatrix(matrix,startRow,startCol);
    }

    private static void printMatrix(int[][] matrix, int startRow, int startCol) {
        for (int i = startRow; i < startRow+3; i++) {
            for (int j = startCol; j <startCol+3 ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
}
