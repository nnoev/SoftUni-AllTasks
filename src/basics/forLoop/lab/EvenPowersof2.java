package basics.forLoop.lab;

import java.util.Scanner;

public class EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i += 2) {
            int a = (int) Math.pow(2, i);
            System.out.println(a);
        }

    }
}
