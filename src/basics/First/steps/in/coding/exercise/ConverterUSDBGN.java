package basics.First.steps.in.coding.exercise;

import java.util.Scanner;

public class ConverterUSDBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        System.out.println(number*1.79549);

    }
}
