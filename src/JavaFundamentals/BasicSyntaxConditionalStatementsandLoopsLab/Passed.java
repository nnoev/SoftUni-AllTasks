package JavaFundamentals.BasicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        if (number>=3.0){
            System.out.println("Passed!");
        }
    }
}
