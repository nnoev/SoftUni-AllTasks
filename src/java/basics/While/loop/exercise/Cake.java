package java.basics.While.loop.exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        int cakes = a * b;
        while (!text.equals("STOP")) {
            int pieces = Integer.parseInt(text);
            cakes = cakes - pieces;
            if (cakes < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakes));
                break;
            }
            text = scanner.nextLine();
        }
        if (cakes > 0) {
            System.out.printf("%d pieces are left.", cakes);
        }

    }
}
