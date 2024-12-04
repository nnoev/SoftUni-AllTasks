package multidimensional.arrays.exercises;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rotationDegree = Integer.parseInt(scanner.nextLine().split("\\(")[1]
                .replaceAll("\\)", "")) % 360;
        String text = scanner.nextLine();
        List<String> words = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;
        while (!text.equals("END")) {
            words.add(text);
            if (maxLength < text.length()) {
                maxLength = text.length();
            }
            text = scanner.nextLine();
        }
        char[][] matrix = new char[words.size()][maxLength];
        fillMatrix(matrix, words);
        switch (rotationDegree) {
            case 90:
                char[][] newMatrix = rotate90(matrix);
                printMatrix(newMatrix);
                break;
            case 180:
                char[][] newMatrix180= rotate180(matrix);
                printMatrix(newMatrix180);
                break;
            case 270:
                char[][]newMatrix270=rotate270(matrix);
                printMatrix(newMatrix270);
                break;
            default:
                printMatrix(matrix);
                break;
        }
        System.out.println();
    }

    private static char[][] rotate270(char[][] matrix) {
        char[][] newMatrix = new char[matrix[0].length][matrix.length];
        ArrayDeque<Character>symbols = new ArrayDeque<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                symbols.offer(matrix[row][col]);
            }
        }
        for (int i = 0; i <newMatrix[0].length ; i++) {
            for (int j = newMatrix.length-1; j >=0 ; j--) {
                newMatrix[j][i]=symbols.pop();
            }
            
        }
        return newMatrix;
    }

    private static char[][] rotate180(char[][] matrix) {
        char[][]newMatrix = new char[matrix.length][matrix[0].length];
        ArrayDeque<Character>symbols = new ArrayDeque<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                symbols.offer(matrix[row][col]);
            }
        }
        for (int i = newMatrix.length-1; i >=0; i--) {
            for (int j = newMatrix[i].length-1; j >=0 ; j--) {
                newMatrix[i][j]=symbols.pop();
            }
        }
        return newMatrix;
    }

    private static void printMatrix(char[][] newMatrix) {
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] rotate90(char[][] matrix) {
        char[][] newMatrix = new char[matrix[0].length][matrix.length];
        ArrayDeque<Character> symbols = new ArrayDeque<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                symbols.offer(matrix[row][col]);
            }
        }
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < newMatrix.length; j++) {
                newMatrix[j][i] = symbols.poll();
            }
        }
        return newMatrix;
    }

    private static void fillMatrix(char[][] matrix, List<String> words) {
        for (int i = 0; i < matrix.length; i++) {
            String line = words.get(i);
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < line.length()) {
                    matrix[i][j] = line.charAt(j);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
    }
}
