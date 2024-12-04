package fundamentals.basic.syntax.conditional.statementsand.loops.exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice =Double.parseDouble(scanner.nextLine());
        double mousePrice =Double.parseDouble(scanner.nextLine());
        double keyboardPrice =Double.parseDouble(scanner.nextLine());
        double displayPrice =Double.parseDouble(scanner.nextLine());
        double sum = 0;
        for (int i = 1; i <=gamesCount ; i++) {
            if (i%2==0){
                sum+=headsetPrice;
            }if (i%3==0){
                sum+=mousePrice;
            }if (i%6==0){
                sum+=keyboardPrice;
            }if (i%12==0){
                sum+=displayPrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.",sum);
    }
}
