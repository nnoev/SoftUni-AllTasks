package basics.nestedLoops.lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double saving = 0;
            while (saving < budget) {
                double save = Double.parseDouble(scanner.nextLine());
                saving=saving+save;
            }
            System.out.printf("Going to %s!%n",destination);
            destination = scanner.nextLine();
        }

    }
}
