package javaOPP.encapsulation.exercises.pizza.calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private final List<Topping> toppings;

    public Pizza(String name, int numberOfTopping) {
        this.setName(name);
        this.setTopping(numberOfTopping);
        this.toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if (name==null ||name.trim().isEmpty()||name.length()>15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setTopping(int toppings) {
        if (toppings<0||toppings>10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }
    public String getName(){
        return this.name;
    }
    public void addTopping(Topping toppign){
        toppings.add(toppign);
    }
    public double getOverallCalories(){
        double totalCal=0.0;
        try {

       totalCal=dough.calculateCalories();
        }catch (NullPointerException ex){
            System.out.println();
        }
       for (Topping topping:toppings){
           totalCal+=topping.calculateCalories();
       }
       return totalCal;
    }
}
