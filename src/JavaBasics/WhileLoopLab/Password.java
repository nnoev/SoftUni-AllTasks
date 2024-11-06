package JavaBasics.WhileLoopLab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String pass = scanner.nextLine();
        while (true) {
            String text = scanner.nextLine();
            if (text.equals(pass)) {
                break;
            }
        }
        System.out.printf("Welcome %s!", user);
    }
}
