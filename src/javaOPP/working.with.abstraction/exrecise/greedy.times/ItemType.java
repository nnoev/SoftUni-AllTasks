package exrecise.greedy.times;

public enum ItemType {
    Gold,
    Cash,
    Gem;

    public static ItemType getItem(String name){
        ItemType items = null;
        if (name.length() == 3) {
            items = ItemType.Cash;
        } else if (name.toLowerCase().endsWith("gem")) {
            items = ItemType.Gem;
        } else if (name.equalsIgnoreCase("gold")) {
            items = ItemType.Gold;
        }
        return items;
    }
}
