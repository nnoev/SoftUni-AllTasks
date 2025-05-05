package basics.forLoop.exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kili = 0;
        int k2 = 0;
        int everest = 0;
        int overalpeople = 0;
        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            overalpeople = overalpeople + people;
            if (people <= 5) {
                musala = musala + people;
            } else if (people <= 12) {
                monblan = monblan + people;
            } else if (people <= 25) {
                kili = kili + people;
            } else if (people <= 40) {
                k2 = k2 + people;
            } else {
                everest = everest + people;
            }
        }
        double a = (double) musala / overalpeople * 100;
        double b = (double) monblan / overalpeople * 100;
        double c = (double) kili / overalpeople * 100;
        double d = (double) k2 / overalpeople * 100;
        double e = (double) everest / overalpeople * 100;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", a, b, c, d, e);
    }
}
