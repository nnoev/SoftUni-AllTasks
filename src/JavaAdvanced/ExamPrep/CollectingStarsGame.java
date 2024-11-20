package JavaAdvanced.ExamPrep;

import java.util.Scanner;

public class CollectingStarsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[n][n];
        fillMatrix(field, scanner);
        int stars = 2;
        int[] playerPos = findPlayer(field);
        String command = scanner.nextLine();
        while (stars != 10 && stars != 0) {
            int[] nextMove=new int [2];
            switch (command) {
                case "right":
                    nextMove[0]=playerPos[0]+1;
                    nextMove[1]=playerPos[1];

                    break;
                case "left":
                    nextMove[0]=playerPos[0]-1;
                    nextMove[1]=playerPos[1];
                    break;
                case "up":
                    nextMove[0]=playerPos[0];
                    nextMove[1]=playerPos[1]-1;
                    break;
                case "down":
                    nextMove[0]=playerPos[0];
                    nextMove[1]=playerPos[1]+1;
                    break;
            }
            printMatrix(field);
            System.out.println(stars);
            command = scanner.nextLine();
        }

    }



    private static void printMatrix(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.printf("%c ", field[i][j]);
            }
            System.out.println();
        }
    }


    private static int[] findPlayer(char[][] field) {
        int[] playerPos = new int[2];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 'P') {
                    playerPos[0] = i;
                    playerPos[1] = j;
                }
            }
        }
        return playerPos;

    }

    private static void fillMatrix(char[][] chars, Scanner scanner) {
        for (int row = 0; row < chars.length; row++) {
            String[] currentRow = scanner.nextLine().split(" ");
            for (int i = 0; i < currentRow.length; i++) {
                chars[row][i] = currentRow[i].charAt(0);
            }
        }
    }
}




