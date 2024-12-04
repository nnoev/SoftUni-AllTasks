package advanced.multidimensional.arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[8][8];
        int[] position = new int[2];
        fillMatrix(matrix, scanner);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char currentChar = matrix[i][j];
                if (currentChar == 'q') {
                    if (isValid(matrix, i, j)) {
                        position[0] = i;
                        position[1] = j;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(position).replaceAll("[\\[\\],]",""));
    }

    private static boolean isValid(char[][] matrix, int i, int j) {
        for (int k = 0; k < matrix.length; k++) {
            if (matrix[i][k] == 'q') {
                if (k==j){
                    continue;
                }
                return false;
            }
        }
        for (int k = 0; k < matrix[i].length; k++) {
            if (matrix[k][j]=='q'){
                if (k==i){
                    continue;
                }
                return false;
            }
        }
        for (int k = 1; k < 8; k++) {
            // Top-left
            if (i - k >= 0 && j - k >= 0 && matrix[i - k][j - k] == 'q') return false;
            // Top-right
            if (i - k >= 0 && j + k < 8 && matrix[i - k][j + k] == 'q') return false;
            // Bottom-left
            if (i + k < 8 && j - k >= 0 && matrix[i + k][j - k] == 'q') return false;
            // Bottom-right
            if (i + k < 8 && j + k < 8 && matrix[i + k][j + k] == 'q') return false;
        }
        return true;
    }


    private static void fillMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row <= matrix.length - 1; row++) {
            String[] currentRow = scanner.nextLine().split(" ");
            for (int i = 0; i < currentRow.length; i++) {
                matrix[row][i] = currentRow[i].charAt(0);
            }
        }
    }


}
