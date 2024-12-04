package exrecise.card.rank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        System.out.println("Card Ranks:");
        if(command.equals("Card Ranks")){
                for (CardRank cards: CardRank.values()){
                    System.out.printf("Ordinal value: %d; Name value: %s%n",cards.ordinal(),cards);
                }
        }

    }
}
