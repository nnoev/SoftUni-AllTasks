package PizzaCalories;

public class Pizza {
    private String name;
    private Dough dough;
    private Topping topping;

    public Pizza(String name, Dough dough, Topping topping) {
        this.name = name;
        this.dough = dough;
        this.topping = topping;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()||name.length()>15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }
}
