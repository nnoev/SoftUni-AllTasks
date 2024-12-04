package java.basics.ConditionalStatementsAdvancedExercise.ConditionalStatementsLab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = "s3cr3t!P@ssw0rd";
        String a = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }

    }
}
