package exam.prep.tanks;

public class Tank {
    private final String brand;
    private final String model;
    private final int weight;
    private final int barrelCaliber;
    private final int armor;

    public Tank(String brand, String model, int weight, int barrelCaliber, int armor) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.barrelCaliber = barrelCaliber;
        this.armor = armor;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getBarrelCaliber() {
        return barrelCaliber;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return "Brand: " + this.getBrand() + ", Model: " + this.getModel() + ", Weight: " + this.getWeight() + "kg, Barrel caliber: " + this.getBarrelCaliber() + "mm, Armor: " + this.getArmor() + "mm";
    }
}
