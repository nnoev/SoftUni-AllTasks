package basics.Nested.loops.exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        double studentsum=0;
        int count =0;
        while (!text.equals("Finish")) {
            double sumgrades = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumgrades += grade;
                studentsum+=grade;
                count++;
            }
            System.out.printf("%s - %.2f.%n", text, sumgrades / n);
            text=scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",studentsum/count);

    }
}
