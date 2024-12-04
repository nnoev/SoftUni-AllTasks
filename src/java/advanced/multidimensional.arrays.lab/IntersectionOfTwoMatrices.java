package java.advanced.multidimensional.arrays.lab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        char [][] matrixA = new char [rowsA][colsA];
        fillMatrix(matrixA,scanner);
        char [][] matrixB = new char [rowsA][colsA];
        fillMatrix(matrixB,scanner);

        for (int row = 0; row <= matrixA.length-1; row++) {
            for (int col = 0; col <= matrixA[row].length-1; col++) {
                if (matrixA[row][col]==matrixB[row][col]){
                    System.out.print(matrixA[row][col]+" ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }


    private static void fillMatrix(char[][] matrixA, Scanner scanner) {
        for (int row = 0; row <= matrixA.length-1; row++) {
            for (int col = 0; col <= matrixA[row].length-1; col++) {
                matrixA[row][col]=scanner.next().charAt(0);
            }
        }
    }

}
