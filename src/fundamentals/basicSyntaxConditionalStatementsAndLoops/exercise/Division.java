package fundamentals.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int div = 0;
        if (n % 2 == 0) {
            div = 2;
        }
        if (n % 3 == 0) {
            div = 3;
        }
        if (n % 6 == 0) {
            div = 6;
        }
        if (n % 7 == 0) {
            div = 7;
        }
        if (n % 10 == 0) {
            div = 10;
        }
        if (div == 0) {
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d",div);
        }

    }
}
