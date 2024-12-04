package java.basics.While.loop.exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyneed = Double.parseDouble(scanner.nextLine());
        double moneyhave = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int count = 0;
        while (moneyhave < moneyneed) {
            if (count == 5) {
                System.out.printf("You can't save the money.%n%d", days);
                break;
            }
            days++;
            String text = scanner.nextLine();
            double n = Double.parseDouble(scanner.nextLine());
            if (text.equals("spend")) {
                moneyhave = moneyhave - n;
                count++;
            }
            if (moneyhave < 0) {
                moneyhave = 0;
            }
            if (text.equals("save")) {
                moneyhave = moneyhave + n;
                count = 0;
            }
        }
        if (moneyhave >= moneyneed) {
            System.out.printf("You saved the money for %d days.", days);
        }

    }
}
