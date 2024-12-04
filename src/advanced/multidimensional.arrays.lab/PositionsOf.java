package advanced.multidimensional.arrays.lab;

import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2 3
        //1 2 3
        //4 2 2
        //2
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        boolean numberIsFound = false;
        fillMatrix(matrix, scanner);

        int numberToFind = scanner.nextInt();
        for (int row = 0; row <= matrix.length - 1; row++) {
            for (int col = 0; col <= matrix[row].length - 1; col++) {
                if (numberToFind == matrix[row][col]) {
                    System.out.println(row + " " + col);
                    numberIsFound=true;
                }
            }
        }
        if (!numberIsFound){
            System.out.println("not found");
        }

    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row <= matrix.length - 1; row++) {
            for (int col = 0; col <= matrix[row].length - 1; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }

}
