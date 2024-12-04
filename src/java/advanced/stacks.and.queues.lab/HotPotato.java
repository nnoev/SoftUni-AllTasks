package java.advanced.stacks.and.queues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String[] names = text.split(" ");
        ArrayDeque<String> player = new ArrayDeque<>();
        for (int i = 0; i <= names.length - 1; i++) {
            player.offer(names[i]);
        }
        while (player.size() > 1) {

            for (int i = 1; i < n; i++) {
                String add = player.peek();
                player.poll();
                player.offer(add);
            }
            System.out.printf("Removed %s%n",player.poll());
        }
        System.out.printf("Last is %s",player.peek());
    }
}
