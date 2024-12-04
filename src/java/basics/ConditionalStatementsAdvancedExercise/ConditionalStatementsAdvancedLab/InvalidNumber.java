package java.basics.ConditionalStatementsAdvancedExercise.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number <= 200 && number >= 100) {
            System.out.println();
        } else if (number == 0) {
            System.out.println();
        } else System.out.println("invalid");
    }

}