package java.basics.first.steps.in.coding.exercise;

import java.util.Scanner;

public class RadianToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        System.out.println(number*180/Math.PI);

    }
}
