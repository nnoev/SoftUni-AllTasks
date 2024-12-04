package java.advanced.stacks.and.queues.lab;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        String[] names = text.split(" ");
        PriorityQueue<String> player = new PriorityQueue<>();

        for (int i = 0; i <= names.length - 1; i++) {
            player.offer(names[i]);
        }
        while (player.size() > 1) {
                String kid = player.poll();
            count++;
            if (isPrime(count)) {
                System.out.printf("Prime %s\n", kid);
                player.offer(kid);
            } else {
                System.out.printf("Removed %s%n", kid);
            }
        }
        System.out.printf("Last is %s", player.peek());
    }

    private static boolean isPrime(int count) {
        if (count <= 1) {
            return false;
        }

        for (int i = 2; i <= count-1; i++) {
            if (count % i == 0) {
                return false;
            }
        }
        return true;
    }

}
