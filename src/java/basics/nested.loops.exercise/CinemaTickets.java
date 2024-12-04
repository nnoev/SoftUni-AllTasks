package java.basics.nested.loops.exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count_standard = 0;
        int count_student = 0;
        int count_kid = 0;
        double total = 0;
        while (!text.equals("Finish")) {
            int free_seats = Integer.parseInt(scanner.nextLine());
            String ticket_type = scanner.nextLine();
            int count = 0;
            while (!ticket_type.equals("End")) {
                total++;
                count++;
                switch (ticket_type) {
                    case "kid":
                        count_kid++;
                        break;
                    case "student":
                        count_student++;
                        break;
                    case "standard":
                        count_standard++;
                        break;
                }
                if (free_seats == count) {
                    break;
                }
                ticket_type = scanner.nextLine();
            }
            double sold_tickets = (double) count / free_seats * 100;
            System.out.printf("%s - %.2f%% full.%n", text, sold_tickets);
            text = scanner.nextLine();
        }

        double a = (double) count_student / total * 100;
        double b = (double) count_standard / total * 100;
        double c = (double) count_kid / total * 100;
        System.out.printf("Total tickets: %.0f%n%.2f%% student tickets.%n%.2f%% standard tickets.%n%.2f%% kids tickets.", total, a, b, c);

    }
}
