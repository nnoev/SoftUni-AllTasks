package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int cent =(int) (number*100);
        int count = 0;
        while (cent >= 200) {
            cent = cent - 200;
            count++;
        }
        while (cent >= 100) {
            cent = cent - 100;
            count++;
        }
        while (cent >= 50) {
            cent = cent - 50;
            count++;
        }
        while (cent >= 20) {
            cent = cent - 20;
            count++;
        }
        while (cent >= 10) {
            cent = cent - 10;
            count++;
        }
        while (cent >= 5) {
            cent = cent - 5;
            count++;
        }
        while (cent >= 2) {
            cent = cent - 2;
            count++;
        }
        while (cent >= 1) {
            cent = cent - 1;
            count++;
        }
        System.out.println(count);

    }
}
