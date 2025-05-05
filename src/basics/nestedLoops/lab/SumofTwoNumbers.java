package basics.nestedLoops.lab;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        boolean find = false;
        int count =0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == number) {
                    find=true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",count,i,j,number);
                    break;
                }
            }
            if (find) {
                break;
            }
        }
        if (!find) {
            System.out.printf("%d combinations - neither equals %d", count, number);
        }

    }
}
