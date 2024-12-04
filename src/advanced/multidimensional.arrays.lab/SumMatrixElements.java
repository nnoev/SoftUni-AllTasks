package advanced.multidimensional.arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] size = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        int [][] matrix = new int [rows][cols];
        int sum =0;
        fillMatrix(matrix,scanner);

        for (int row = 0; row <= matrix.length-1; row++) {
            for (int col = 0; col <= matrix[row].length-1; col++) {
                sum += matrix[row][col];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {

        for (int row = 0; row <= matrix.length-1; row++) {
            int [] currentRow = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[row]=currentRow;
        }

    }


}
