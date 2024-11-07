package JavaFundamentals.ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number1 = scanner.nextBigInteger();
        BigInteger number2 = scanner.nextBigInteger();

        BigInteger sum = number1.add(number2);
        System.out.println(sum);
    }
}
