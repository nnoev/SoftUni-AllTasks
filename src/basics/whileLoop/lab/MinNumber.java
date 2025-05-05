package basics.whileLoop.lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int max = Integer.MAX_VALUE;
        while (!text.equals("Stop")) {
            int number = Integer.parseInt(text);
            if (number < max) {
                max = number;
            }
            text = scanner.nextLine();
        }
        System.out.println(max);
    }
}
