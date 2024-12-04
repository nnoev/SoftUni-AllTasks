package javaOPP.working.with.abstraction.exrecise.greedy.times;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Bag {
    private long capacity;
    List<Item> items;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void add(Item itemToAdd) {
        if (canAdd(itemToAdd)) {
            Item item = getItem(itemToAdd);
            if (item == null) {
                this.items.add(itemToAdd);
            } else {
                item.setAmount(item.getAmount() + itemToAdd.getAmount());
            }
        }
    }

    public void printBag() {
        LinkedHashMap<ItemType, List<Item>> itemsMap = this.items.stream()
                .collect(Collectors.groupingBy(Item::getItemType, LinkedHashMap::new, Collectors.toList()));

        itemsMap.entrySet().stream()
                .sorted((a, b) -> Long.compare(
                        b.getValue().stream().mapToLong(Item::getAmount).sum(),
                        a.getValue().stream().mapToLong(Item::getAmount).sum()))
                .forEach(entry -> {
                    ItemType type = entry.getKey();
                    long totalAmount = entry.getValue().stream().mapToLong(Item::getAmount).sum();
                    System.out.printf("<%s> $%d%n", type, totalAmount);

                    entry.getValue().stream()
                            .sorted((item1, item2) -> {
                                int nameComparison = item2.getName().compareTo(item1.getName());
                                if (nameComparison != 0) {
                                    return nameComparison;
                                }
                                return Long.compare(item1.getAmount(), item2.getAmount());
                            })
                            .forEach(item -> System.out.printf("##%s - %d%n", item.getName(), item.getAmount()));
                });
    }

    private Item getItem(Item itemToAdd) {
        return this.items.stream().filter(item -> item.equals(itemToAdd)).findFirst().orElse(null);
    }

    private boolean canAdd(Item itemToAdd) {
        if (this.capacity < getTotalAmount() + itemToAdd.getAmount()) {
            return true;
        }
        if (itemToAdd.getItemType() == null) {
            return false;
        }
        switch (itemToAdd.getItemType()) {
            case Gem:
                if (itemToAdd.getAmount() + getTotalAmountByType(ItemType.Gem) > getTotalAmountByType(ItemType.Gold)) {
                    return false;
                }

                break;
            case Cash:
                if (itemToAdd.getAmount() + getTotalAmountByType(ItemType.Cash) > getTotalAmountByType(ItemType.Gem)) {
                    return false;
                }


                break;
        }


        return false;
    }

    private long getTotalAmountByType(ItemType itemType) {
        return this.items.stream().filter(item -> item.getItemType().equals(itemType)).mapToLong(Item::getAmount).sum();
    }

    private long getTotalAmount() {
        return this.items.stream().mapToLong(Item::getAmount).sum();
    }
}
