package JavaFundamentals.BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int compare = number;
        int sum = 0;
        while (number/10!=0 || number>0){
            int last = number%10;
           sum+=factorial(last);
           number=number/10;
        }
        if (sum==compare){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }

    private static int  factorial(int number) {
        int fact = 1;
        for (int i = 1; i <=number ; i++) {
            fact*=i;
        }
        return fact;
    }
}
