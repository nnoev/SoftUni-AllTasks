package exam.prep;

import java.util.Arrays;
import java.util.Scanner;

public class CollectingStarsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[n][n];
        fillField(field, scanner);
        int[] stars = {2};
        int[] playerPosition = new int[2];
        int [] nextStep = new int[2];
        findPlayer(field, playerPosition);
        while (stars[0] > 0 && stars[0] < 10) {
            String command = scanner.nextLine();
            movePlayer(command, playerPosition,nextStep, field, stars);
        }
        if (stars[0] == 10) {
            System.out.println("You won! You have collected 10 stars.");
        } else {
            System.out.println("Game over! You are out of any stars.");
        }
        System.out.println("Your final position is " + Arrays.toString(playerPosition));
        printField(field);
    }

    private static void printField(char[][] field) {
        for (int i = 0; i <= field.length - 1; i++) {
            for (int j = 0; j <= field[i].length - 1; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void movePlayer(String command, int[] playerPosition, int[] nextStep, char[][] field, int[] stars) {
        switch (command) {
            case "up":
                if (playerPosition[0] == 0) {
                    startPoint(playerPosition,field,stars);
                    break;
                }
                if (field[playerPosition[0]-1][playerPosition[1]] == '#') {
                    nextStep[0]=playerPosition[0]-1;
                    nextStep[1]=playerPosition[1];
                    checkNext(field, nextStep, stars);
                } else {
                    field[playerPosition[0]][playerPosition[1]] = '.';
                    playerPosition[0]--;
                    checkNext(field, playerPosition, stars);
                }
                break;
            case "down":
                if (playerPosition[0] == field.length - 1) {
                    startPoint(playerPosition, field ,stars);
                    break;
                }
                if (field[playerPosition[0]+1][playerPosition[1]] == '#') {
                    nextStep[0]=playerPosition[0]+1;
                    nextStep[1]=playerPosition[1];
                    checkNext(field, nextStep, stars);
                } else {
                    field[playerPosition[0]][playerPosition[1]] = '.';
                    playerPosition[0]++;
                    checkNext(field, playerPosition, stars);
                }
                break;
            case "left":
                if (playerPosition[1] == 0) {
                    startPoint(playerPosition,field,stars);
                    break;
                }
                if (field[playerPosition[0]][playerPosition[1]-1] == '#') {
                    nextStep[1]=playerPosition[1]-1;
                    nextStep[0]=playerPosition[0];
                    checkNext(field, nextStep, stars);
                } else {
                    field[playerPosition[0]][playerPosition[1]] = '.';
                    playerPosition[1]--;
                    checkNext(field, playerPosition, stars);
                }
                break;
            case "right":
                if (playerPosition[1] == field[playerPosition[0]].length - 1) {
                    startPoint(playerPosition,field,stars);
                    break;
                }
                if (field[playerPosition[0]][playerPosition[1]+1] == '#') {
                    nextStep[0]=playerPosition[0];
                    nextStep[1]=playerPosition[1]+1;
                    checkNext(field, nextStep, stars);
                } else {
                    field[playerPosition[0]][playerPosition[1]] = '.';
                    playerPosition[1]++;
                    checkNext(field, playerPosition, stars);
                }
                break;
        }
    }

    private static void checkNext(char[][] field, int[] playerPosition, int[] stars) {
        switch (field[playerPosition[0]][playerPosition[1]]) {
            case '.':
                field[playerPosition[0]][playerPosition[1]] = 'P';
                break;
            case '*':
                field[playerPosition[0]][playerPosition[1]] = 'P';
                stars[0]++;
                break;
            case '#':
                stars[0]--;
                break;
        }
    }

    private static void startPoint(int[] playerPosition, char[][] field , int [] stars) {
        field[playerPosition[0]][playerPosition[1]]='.';
        if (field[0][0]=='*'){
            stars[0]++;
        }
        playerPosition[0] = 0;
        playerPosition[1] = 0;
        field[playerPosition[0]][playerPosition[1]]='P';
    }

    private static void findPlayer(char[][] field, int[] playerPosition) {
        for (int i = 0; i <= field.length - 1; i++) {
            for (int j = 0; j <= field[i].length - 1; j++) {
                if (field[i][j] == 'P') {
                    playerPosition[0] = i;
                    playerPosition[1] = j;
                }
            }
        }
    }

    private static void fillField(char[][] field, Scanner scanner) {
        for (int i = 0; i <= field.length - 1; i++) {
            String[] currentLine = scanner.nextLine().split(" ");
            for (int j = 0; j <= field[i].length - 1; j++) {
                field[i][j] = currentLine[j].charAt(0);
            }
        }
    }
}
