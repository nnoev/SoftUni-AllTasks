package JavaOOP.WorkingWithAbstractionExrecise.GreedyTimes;

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
    public void add (Item itemToAdd){
        if (canAdd(itemToAdd)){
           Item item =getItem(itemToAdd);
           if (item==null){
               this.items.add(itemToAdd);
           }else {
               item.setAmount(item.getAmount()+itemToAdd.getAmount());
           }
        }
    }
    public void printBag (){
        LinkedHashMap<ItemType, List<Item>> itemsMap = this.items.stream().collect(Collectors.groupingBy(Item::getItemType, LinkedHashMap::new, Collectors.toList()));
        itemsMap.entrySet().stream().sorted();


    }

    private Item getItem(Item itemToAdd) {
        return this.items.stream().filter(item -> item.equals(itemToAdd)).findFirst().orElse(null);
    }

    private boolean canAdd(Item itemToAdd) {
        if(this.capacity< getTotalAmount() + itemToAdd.getAmount()){
            return false;
        }
        if (itemToAdd.getItemType()==null){
            return  false;
        }
        switch (itemToAdd.getItemType()){
            case Gem:
                    if (itemToAdd.getAmount()+getTotalAmountByType(ItemType.Gem)>getTotalAmountByType(ItemType.Gold)){
                        return false;
                    }

                break;
            case Cash:
                if (itemToAdd.getAmount()+getTotalAmountByType(ItemType.Cash)>getTotalAmountByType(ItemType.Gem)){
                    return false;
                }


                break;
        }



        return false;
    }

    private long  getTotalAmountByType(ItemType itemType) {
        return  this.items.stream().filter(item -> item.getItemType().equals(itemType)).mapToLong(Item::getAmount).sum();
    }

    private long getTotalAmount() {
        return this.items.stream().mapToLong(Item::getAmount).sum();
    }
}
