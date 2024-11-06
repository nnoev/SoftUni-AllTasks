package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        String text = scanner.nextLine();
        int check = 0;
        while (!text.equals(book)) {
            if (text.equals("No More Books")) {
                System.out.printf("The book you search is not here!%nYou checked %d books.", check);
                break;
            }
            check = check + 1;
            text = scanner.nextLine();
        }
        if (text.equals(book)){
            System.out.printf("You checked %d books and found it.",check);
        }

    }
}
