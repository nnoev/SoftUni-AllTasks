package advanced.stacks.and.queues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        String[] commandText;
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> last = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            commandText = scanner.nextLine().split(" ");
            int command = Integer.parseInt(commandText[0]);
                String textToAppend = "";
            if (commandText.length>1) {
                textToAppend=commandText[1];
            }
            switch (command) {
                case 1:
                    last.push(String.valueOf(text));
                    text.append(textToAppend);
                    break;
                case 2:
                    last.push(String.valueOf(text));
                    text.delete(text.length()-Integer.parseInt(textToAppend),text.length());
                    break;
                case 3:
                    System.out.println(text.charAt(Integer.parseInt(textToAppend) - 1));
                    break;
                case 4:
                    text= new StringBuilder(last.pop());
                    break;

            }
        }

    }
}
