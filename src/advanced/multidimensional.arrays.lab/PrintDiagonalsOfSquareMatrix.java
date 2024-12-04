package multidimensional.arrays.lab;

import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsCols = scanner.nextInt();
        int [][] matrix = new int [rowsCols][rowsCols];

        for (int row = 0; row <=matrix.length-1 ; row++) {
            for (int col = 0; col <= matrix[row].length-1; col++) {
                matrix[row][col]=scanner.nextInt();
            }
        }

        for (int row = 0; row <= matrix.length-1; row++) {
            System.out.print(matrix[row][row]+ " ");
        }
        System.out.println();
        for (int row = matrix.length-1; row >= 0; row--) {
            System.out.print(matrix[row][matrix.length-1-row]+ " ");
        }

    }

}
