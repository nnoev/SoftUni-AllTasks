package java.basics.first.steps.in.coding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dogFood=Double.parseDouble(scanner.nextLine());
        double catFood =Double.parseDouble(scanner.nextLine());
        System.out.println(dogFood*2.5+catFood*4);
    }
}
