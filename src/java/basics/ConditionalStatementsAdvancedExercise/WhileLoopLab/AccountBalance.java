package java.basics.ConditionalStatementsAdvancedExercise.WhileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        double cash = 0;
        while (!text.equals("NoMoreMoney")){
            double sum = Double.parseDouble(text);
            if (sum<0){
                System.out.printf("Invalid operation!%n");
                break;
            }
            cash = cash +sum;
            System.out.printf("Increase: %.2f%n",sum);
            text = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",cash);
    }
}
