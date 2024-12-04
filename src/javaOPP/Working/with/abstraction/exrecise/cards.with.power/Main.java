package with.abstraction.exrecise.cards.with.power;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        int cardPower = CardsRanks.valueOf(rank).getPower()+CardsSuits.valueOf(suit).getSuits();
        System.out.printf("Card name: %s of %s; Card power: %d",CardsRanks.valueOf(rank),CardsSuits.valueOf(suit),cardPower);


    }
}
