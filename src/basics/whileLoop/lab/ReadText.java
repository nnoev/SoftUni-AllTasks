package basics.whileLoop.lab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("Stop")){
            System.out.println(text);
            text = scanner.nextLine();
        }

    }
}
