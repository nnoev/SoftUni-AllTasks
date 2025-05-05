package fundamentals.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double disc = 1;
        switch (day) {
            case "Friday":
                switch (type) {
                    case "Students":
                        if (n >= 30) {
                            disc = 0.85;
                        }
                        System.out.printf("Total price: %.2f", n * 8.45 * disc);
                        break;
                    case "Business":
                        if (n >= 100) {
                            n = n - 10;
                        }
                        System.out.printf("Total price: %.2f", n * 10.9 * disc);
                        break;
                    case "Regular":
                        if (n >= 10 && n <= 20) {
                            disc = 0.95;
                        }
                        System.out.printf("Total price: %.2f", n * 15 * disc);
                        break;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        if (n >= 30) {
                            disc = 0.85;
                        }
                        System.out.printf("Total price: %.2f", n * 9.8 * disc);
                        break;
                    case "Business":
                        if (n >= 100) {
                            n = n - 10;
                        }
                        System.out.printf("Total price: %.2f", n * 15.6 * disc);
                        break;
                    case "Regular":
                        if (n >= 10 && n <= 20) {
                            disc = 0.95;
                        }
                        System.out.printf("Total price: %.2f", n * 20 * disc);
                        break;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        if (n >= 30) {
                            disc = 0.85;
                        }
                        System.out.printf("Total price: %.2f", n * 10.46 * disc);
                        break;
                    case "Business":
                        if (n >= 100) {
                            n = n - 10;
                        }
                        System.out.printf("Total price: %.2f", n * 16 * disc);
                        break;
                    case "Regular":
                        if (n >= 10 && n <= 20) {
                            disc = 0.95;
                        }
                        System.out.printf("Total price: %.2f", n * 22.5 * disc);
                        break;
                }
                break;
        }

    }
}
