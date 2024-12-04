package java.basics.For.loop.lab;

import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= 2 * n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i <= n) {
                sum1 = sum1 + number;
            } else {
                sum2 = sum2 + number;
            }
        }
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }
    }
}
