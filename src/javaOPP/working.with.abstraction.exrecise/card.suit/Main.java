package javaOPP.working.with.abstraction.exrecise.card.suit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        System.out.println("Card Suits:");
        if (command.equals("Card Suits")) {
            for (CardSuits card :CardSuits.values()) {
                System.out.printf("Ordinal value: %d; Name value: %s%n",card.ordinal(),card);
            }
        }
    }
}
