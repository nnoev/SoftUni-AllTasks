package basics.forLoop.lab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        for (int i=0; i<=text.length()-1;i++){
            System.out.println(text.charAt(i));
        }

    }
}
