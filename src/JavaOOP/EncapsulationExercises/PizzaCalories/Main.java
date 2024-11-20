package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []input = scanner.nextLine().split(" ");
        String nameOfPizza= input[1];
        int numberOfToppings= Integer.parseInt(input[2]);
        String[] doughInput = scanner.nextLine().split(" ");
        String flourType = doughInput[1];
        String bakingTechnique= doughInput[2];
        double weight = Double.parseDouble(doughInput[3]);
        Dough dough=new Dough(flourType,bakingTechnique,weight);
        if (Integer.parseInt( input[2])>10){
            throw  new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }else {
            String command = scanner.nextLine();
            while (!command.equals("END")){
                String toppingType = command.split(" ")[1];
                double weightOfTopping = Double.parseDouble(command.split(" ")[2]);


                command=scanner.nextLine();
            }
        }

    }
}
