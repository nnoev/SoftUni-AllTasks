package JavaBasics.NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        for (int i = n1; i <= n2; i++) {
            String a = String.valueOf(i);
            int sumeven = 0;
            int sumodd = 0;
            for (int j = 0; j <= a.length() - 1; j++) {
                int b = Integer.parseInt(String.valueOf(a.charAt(j)));
                if (j % 2 == 0) {
                    sumeven = sumeven + b;
                } else {
                    sumodd = sumodd + b;
                }
            }
            if (sumeven==sumodd){
                System.out.printf("%d ",i);
            }
        }
    }
}
