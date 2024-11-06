package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        double overallgrade = 0;
        int poogrades = 0;
        int problems = 0;
        String last = "";
        while (!name.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                poogrades++;
            }
            if (poogrades == n) {
                System.out.printf("You need a break, %d poor grades.", poogrades);
                break;
            }
            overallgrade = overallgrade + grade;
            last = name;
            name = scanner.nextLine();
            problems++;
        }
        if (poogrades < n) {
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s%n", overallgrade / problems, problems, last);
        }

    }
}
