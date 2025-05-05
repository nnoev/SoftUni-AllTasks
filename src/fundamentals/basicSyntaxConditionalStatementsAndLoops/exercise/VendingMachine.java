package fundamentals.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String product = scanner.nextLine();
        while (!product.equals("Start")) {
            double coins = Double.parseDouble(product);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            product = scanner.nextLine();
        }
        product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (sum < 2) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 2;
                    System.out.printf("Purchased %s%n",product);
                    break;
                case "Water":
                    if (sum < 0.7) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 0.7;
                    System.out.printf("Purchased %s%n",product);
                    break;
                case "Crisps":
                    if (sum < 1.5) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 1.5;
                    System.out.printf("Purchased %s%n",product);
                    break;
                case "Soda":
                    if (sum < 0.8) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }

                    sum -= 0.8;
                    System.out.printf("Purchased %s%n",product);
                    break;
                case "Coke":
                    if (sum < 1) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 1;
                    System.out.printf("Purchased %s%n",product);
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n",sum);

    }
}
