package java.advanced.multidimensional.arrays.exercises;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        fillMatrix(matrix, scanner);
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("END")){
            if (!command[0].equals("swap")){
                System.out.println("Invalid input!");
                continue;
            }
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
