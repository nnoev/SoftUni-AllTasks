package PizzaCalories;

public class Topping {
    private String toppingType;
    private double weigh;

    public Topping(String toppingType, double weigh) {
        this.setToppingType(toppingType);
        this.setWeigh(weigh);
    }

    int count;

    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
            count++;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    private void setWeigh(double weigh) {
        if (weigh < 1 || weigh > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", toppingType));
        }
        this.weigh = weigh;
    }

    public double calculateCalories() {
        return;
    }
}
