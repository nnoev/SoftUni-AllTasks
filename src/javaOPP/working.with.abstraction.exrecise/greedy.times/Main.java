
package javaOPP.working.with.abstraction.exrecise.greedy.times;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bagCapacity = Integer.parseInt(scanner.nextLine());
        String[] safeContent = scanner.nextLine().split("\\s+");
        Bag bag = new Bag(bagCapacity);

        for (int i = 0; i < safeContent.length; i += 2) {
            String name = safeContent[i];
            int quantity = Integer.parseInt(safeContent[i + 1]);
            ItemType itemType = ItemType.getItem(name);
            if (itemType != null) {
                Item item = new Item(name, quantity, itemType);
                bag.add(item);
            }
        }
        bag.printBag();
    }
}