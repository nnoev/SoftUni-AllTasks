package JavaFundamentals.BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sum =0;
        for (int i = 1; i <= n; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsule = Integer.parseInt(scanner.nextLine());

            double priceOfTheCoffee = days*capsule*price;
            sum+=priceOfTheCoffee;
            System.out.printf("The price for the coffee is: $%.2f%n",priceOfTheCoffee);
        }
        System.out.printf("Total: $%.2f",sum);
    }
}
