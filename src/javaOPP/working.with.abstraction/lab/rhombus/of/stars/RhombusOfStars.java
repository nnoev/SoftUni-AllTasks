package lab.rhombus.of.stars;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printRow(n);

    }

    private static void printRow(int n) {


        for (int i = 1; i <=n ; i++) {
            printStars(i,n);
        }
        for (int i = n-1; i >=1 ; i--) {
            printStars(i,n);

        }
    }

    private static void printStars(int i, int size) {
        int count=size-i;
        for (int j = count; j >=0 ; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
