package fundamentals.dataTypesAndVariables.lab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.3f", n * 1.36);
    }

}
