package java.basics.ConditionalStatementsAdvancedExercise.ForLoopExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double pricewosh = Double.parseDouble(scanner.nextLine());
        int pricetoy = Integer.parseInt(scanner.nextLine());
        int toys = 0;
        int money = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                int add = i / 2 * 10;
                money = money + add - 1;
            } else {
                toys = toys + 1;
            }
        }
        int moneyhave = toys * pricetoy + money;
        if (moneyhave >= pricewosh) {
            System.out.printf("Yes! %.2f", moneyhave - pricewosh);
        } else {
            System.out.printf("No! %.2f", pricewosh - moneyhave);
        }

    }
}
