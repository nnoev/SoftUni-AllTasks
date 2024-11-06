package JavaFundamentals.BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class PrintandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int sum =0;
        for (int i = n1; i <=n2 ; i++) {
            sum = sum+i;
        }
        for (int i = n1; i <=n2 ; i++) {
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);

    }
}
