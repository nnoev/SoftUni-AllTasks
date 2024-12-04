package encapsulation.exercises.pizza.calories;

public class Topping {
    private String toppingType;
    private double weigh;

    public Topping(String toppingType, double weigh) {
        this.setToppingType(toppingType);
        this.setWeigh(weigh);
    }


    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
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
        double toppingCal=0.0;
        switch (toppingType){
            case "Meat":
                toppingCal=1.2;
                break;
            case "Veggies":
                toppingCal=0.8;
                break;
            case "Cheese":
                toppingCal=1.1;
                break;
            case "Sauce":
                toppingCal=0.9;
                break;
        }
        return 2*this.weigh*toppingCal;
    }
}
