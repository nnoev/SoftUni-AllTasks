package fundamentals.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String password = "";
        int letters = user.length();
        for (int i = letters - 1; i >= 0; i--) {
            char a = user.charAt(i);
            password += a;
        }
        for (int i = 0; i <= 2; i++) {
            String text = scanner.nextLine();
            if (text.equals(password)) {
                System.out.printf("User %s logged in.", user);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
            if (i == 2) {
                System.out.printf("User %s blocked!", user);
            }
        }

    }
}
