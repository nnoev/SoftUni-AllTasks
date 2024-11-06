package JavaBasics.NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int sumofprime = 0;
        int sumofnonprime = 0;
        while (!text.equals("stop")) {
            int a = Integer.parseInt(text);
            if (a < 0) {
                System.out.println("Number is negative.");
            }else {
                boolean isprime = true;
                for (int i = 2; i < a; i++)
                    if (a % i == 0) {
                        isprime = false;
                        break;
                    }
                if (isprime) {
                    sumofprime += a;
                } else {
                    sumofnonprime += a;
                }
            }
            text = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%nSum of all non prime numbers is: %d", sumofprime, sumofnonprime);

    }
}
