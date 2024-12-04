package java.basics.For.loop.exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyrate = Double.parseDouble(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            String numbername = scanner.nextLine();
            double numberrate = Double.parseDouble(scanner.nextLine());
            academyrate = (numbername.length() * numberrate / 2)+academyrate;
            if (academyrate > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, academyrate);
                break;
            }
        }
        if (academyrate <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - academyrate);
        }
    }
}