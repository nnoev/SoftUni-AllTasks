package java.basics.ConditionalStatementsAdvancedExercise.NestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int a =1;
        for (int i = 1; i <=n ; i++) {
            System.out.println();
            for (int j = 1; j <=i ; j++) {
                System.out.print(a + " ");
                if (a == n) {
                    return;
                }
                a++;
            }
        }

    }
}
