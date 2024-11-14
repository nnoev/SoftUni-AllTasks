
package JavaOOP.WorkingWithAbstractionExrecise.GreedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;
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
        Item item = new Item(name,quantity,ItemType.getItem(name));
            bag.add(item);

        for (Map.Entry<String,LinkedHashMap<String,Long>> x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", x.getKey(), sumValues);

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

}