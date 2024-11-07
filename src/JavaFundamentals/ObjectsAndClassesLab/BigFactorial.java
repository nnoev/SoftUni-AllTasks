package JavaFundamentals.ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fact(n));
    }

    private static BigInteger fact(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n ; i++) {
           factorial= factorial.multiply(BigInteger.valueOf(i));
        }
        return  factorial;
    }
}
