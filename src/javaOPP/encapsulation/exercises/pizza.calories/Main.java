package pizza.calories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String nameOfPizza = input[1];
        int numberOfToppings = Integer.parseInt(input[2]);
        Pizza pizza;
        try {
            pizza = new Pizza(nameOfPizza, numberOfToppings);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        String[] doughInput = scanner.nextLine().split(" ");
        String flourType = doughInput[1];
        String bakingTechnique = doughInput[2];
        double weight = Double.parseDouble(doughInput[3]);
        Dough dough;
        try {
            dough = new Dough(flourType, bakingTechnique, weight);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            try {
                String toppingType = command.split(" ")[1];
                double weightOfTopping = Double.parseDouble(command.split(" ")[2]);
                Topping topping = new Topping(toppingType, weightOfTopping);
                pizza.setDough(dough);
                pizza.addTopping(topping);
                command = scanner.nextLine();
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                break;
            }
        }
        System.out.printf("%s - %.2f",nameOfPizza,pizza.getOverallCalories());
    }
}
