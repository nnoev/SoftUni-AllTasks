package javaOPP.encapsulation.exercises.Class.box.data.validation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l =Double.parseDouble(scanner.nextLine());
        double w =Double.parseDouble(scanner.nextLine());
        double h =Double.parseDouble(scanner.nextLine());
        Box box = new Box(l,w,h);
//        Surface Area - 52.00
//        Lateral Surface Area - 40.00
//        Volume – 24.00

        System.out.printf("Surface Area - %.2f\n",box.calculateSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f\n",box.calculateLateralSurfaceArea());
        System.out.printf("Volume – %.2f",box.calculateVolume());
    }

}
