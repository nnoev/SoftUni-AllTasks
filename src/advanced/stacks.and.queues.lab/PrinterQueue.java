package advanced.stacks.and.queues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!command.equals("print")) {
            if (command.equals("cancel") && queue.isEmpty()) {
                System.out.println("Printer is on standby");
                command = scanner.nextLine();
                continue;
            }
            if (command.equals("cancel")) {
                String task = queue.peek();
                System.out.printf("Canceled %s%n", task);
                queue.poll();
                command = scanner.nextLine();
                continue;
            }
            queue.offer(command);
            command = scanner.nextLine();
        }
        if (queue.isEmpty()) {
            System.out.println();
        } else {
            while (!queue.isEmpty()){
                System.out.println(queue.poll());
            }
        }
    }
}

