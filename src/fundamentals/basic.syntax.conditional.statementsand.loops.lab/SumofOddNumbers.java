package fundamentals.basic.syntax.conditional.statementsand.loops.lab;

import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 1;
        for (int i = 1; i <=n ; i++) {
            System.out.println(number);
            sum+=number;
            number+=2;
        }
        System.out.printf("Sum: %d",sum);
    }
}
