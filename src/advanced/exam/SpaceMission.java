import java.util.Scanner;

public class SpaceMission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[n][n];
        fillField(field, scanner);
        int resources = 100;
        int[] playerPosition = new int[2];
        findPlayer(field, playerPosition);
        while (resources > 0) {
            String command = scanner.nextLine();
            switch (command) {
                case "up":
                    resources -= 5;
                    if (playerPosition[0] == 0) {
                        System.out.println("Mission failed! The spaceship was lost in space.");
                        printField(field);
                        return;
                    }
                    if (field[playerPosition[0] - 1][playerPosition[1]] == 'M') {
                        resources -= 5;
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[0]--;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        } else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[0]--;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        }
                        break;
                    }
                    if (field[playerPosition[0] - 1][playerPosition[1]] == 'R') {
                        resources += 10;
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[0]--;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        }else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[0]--;
                        }
                        break;
                    }
                    if (field[playerPosition[0] - 1][playerPosition[1]] == '.') {
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[0]--;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        }else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[0]--;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        }
                        break;
                    }
                    if (field[playerPosition[0] - 1][playerPosition[1]] == 'P') {
                        if (field[playerPosition[0]][playerPosition[1]]=='R'){
                            field[playerPosition[0]][playerPosition[1]]='R';
                        }else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                        }
                        System.out.printf("Mission accomplished! The spaceship reached Planet B with %d resources left.\n", resources);
                        printField(field);
                        return;
                    }
                case "down":
                    resources -= 5;
                    if (playerPosition[0] == field.length - 1) {
                        System.out.println("Mission failed! The spaceship was lost in space.");
                        printField(field);
                        return;
                    }
                    if (field[playerPosition[0] + 1][playerPosition[1]] == 'M') {
                        resources -= 5;
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[0]++;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        } else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[0]++;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        }
                        break;
                    }
                    if (field[playerPosition[0] + 1][playerPosition[1]] == 'R') {
                        resources += 10;
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[0]++;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        } else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[0]++;
                        }
                        break;
                    }
                    if (field[playerPosition[0] + 1][playerPosition[1]] == '.') {
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[0]++;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        } else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[0]++;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        }
                        break;
                    }
                    if (field[playerPosition[0] + 1][playerPosition[1]] == 'P') {
                        if (   field[playerPosition[0]][playerPosition[1]]=='R') {
                            field[playerPosition[0]][playerPosition[1]] = 'R';
                        }else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                        }
                        System.out.printf("Mission accomplished! The spaceship reached Planet B with %d resources left.\n", resources);
                        printField(field);
                        return;
                    }
                case "left":
                    resources -= 5;
                    if (playerPosition[1] == 0) {
                        System.out.println("Mission failed! The spaceship was lost in space.");
                        printField(field);
                        return;
                    }
                    if (field[playerPosition[0]][playerPosition[1] - 1] == 'M') {
                        resources -= 5;
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[1]--;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        } else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[1]--;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        }
                        break;
                    }
                    if (field[playerPosition[0]][playerPosition[1] - 1] == 'R') {
                        resources += 10;
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[1]--;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        } else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[1]--;
                        }
                        break;
                    }
                    if (field[playerPosition[0]][playerPosition[1] - 1] == '.') {
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[1]--;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        } else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[1]--;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        }
                        break;
                    }
                    if (field[playerPosition[0]][playerPosition[1] - 1] == 'P') {
                        if (   field[playerPosition[0]][playerPosition[1]]=='R') {
                            field[playerPosition[0]][playerPosition[1]] = 'R';
                        }else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                        }
                        System.out.printf("Mission accomplished! The spaceship reached Planet B with %d resources left.\n", resources);
                        printField(field);
                        return;
                    }
                case "right":
                    resources -= 5;
                    if (playerPosition[1] == field[0].length - 1) {
                        System.out.println("Mission failed! The spaceship was lost in space.");
                        printField(field);
                        return;
                    }
                    if (field[playerPosition[0]][playerPosition[1] + 1] == 'M') {
                        resources -= 5;
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[1]++;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        } else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[1]++;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        }
                        break;
                    }
                    if (field[playerPosition[0]][playerPosition[1] + 1] == 'R') {
                        resources += 10;
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[1]++;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        } else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[1]++;
                        }
                        break;
                    }
                    if (field[playerPosition[0]][playerPosition[1] + 1] == '.') {
                        if (field[playerPosition[0]][playerPosition[1]] == 'R') {
                            playerPosition[1]++;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        } else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                            playerPosition[1]++;
                            field[playerPosition[0]][playerPosition[1]] = 'S';
                        }
                        break;
                    }
                    if (field[playerPosition[0]][playerPosition[1] + 1] == 'P') {
                        if (   field[playerPosition[0]][playerPosition[1]]=='R') {
                            field[playerPosition[0]][playerPosition[1]] = 'R';
                        }else {
                            field[playerPosition[0]][playerPosition[1]] = '.';
                        }
                        System.out.printf("Mission accomplished! The spaceship reached Planet B with %d resources left.\n", resources);
                        printField(field);
                        return;
                    }
            }
        }
        if (resources <= 0) {
            System.out.println("Mission failed! The spaceship was stranded in space.");
            printField(field);
        }
    }

    private static void printField(char[][] field) {
        for (int i = 0; i <= field.length - 1; i++) {
            for (int j = 0; j <= field[i].length - 1; j++) {
                System.out.print(field[i][j]);
                if (j != field[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void findPlayer(char[][] field, int[] playerPosition) {
        for (int i = 0; i <= field.length - 1; i++) {
            for (int j = 0; j <= field[i].length - 1; j++) {
                if (field[i][j] == 'S') {
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
