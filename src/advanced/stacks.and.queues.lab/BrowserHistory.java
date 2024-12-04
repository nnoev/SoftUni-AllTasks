package advanced.stacks.and.queues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        while (!text.equals("Home")) {
            if (!text.equals("back")) {
                stack.push(text);
                System.out.println(stack.peek());
            }
            if (text.equals("back") && stack.size() <= 1) {
                System.out.println("no previous URLs");
            }
            if (text.equals("back") && stack.size() >= 2) {
                stack.pop();
                System.out.println(stack.peek());
            }
            text = scanner.nextLine();
        }
    }
}

