package javaOPP.working.with.abstraction.exrecise.greedy.times;

import java.util.Objects;

public class Item {
    private String name;
    private int amount;
    private ItemType itemType;

    public Item(String name, int amount, ItemType itemType) {
        this.name = name;
        this.amount = amount;
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) && itemType == item.itemType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, itemType);
    }
}
