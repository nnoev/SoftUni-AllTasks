package multidimensional.arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix, scanner);
        int sum = Integer.MIN_VALUE;
        int[] bestStartIndex = new int[2];
        int start = 0;
        while (start<matrix.length-1){
            int getSum=0;
                for (int j = 0; j <matrix[start].length-1 ; j++) {
                    getSum = matrix[start][j] + matrix[start][j + 1] + matrix[start + 1][j] + matrix[start + 1][j + 1];
                    if (getSum > sum) {
                        sum = getSum;
                        bestStartIndex[0] = start;
                        bestStartIndex[1]=j;
                    }
                }

            start++;
        }
        printMatrix(bestStartIndex,matrix);
        System.out.println(sum);
    }

    private static void printMatrix(int[] bestStartIndex, int[][] matrix) {
        System.out.printf("%d %d%n%d %d%n",matrix[bestStartIndex[0]][bestStartIndex[1]],matrix[bestStartIndex[0]][bestStartIndex[1]+1],matrix[bestStartIndex[0]+1][bestStartIndex[1]],matrix[bestStartIndex[0]+1][bestStartIndex[1]+1]);
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {

        for (int row = 0; row <= matrix.length - 1; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = currentRow;
        }

    }
}
