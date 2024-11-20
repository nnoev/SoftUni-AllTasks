package JavaAdvanced.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        String[] names = text.split(" ");
        ArrayDeque<String> players = new ArrayDeque<>();
        for (int i = 0; i <= names.length - 1; i++) {
            players.offer(names[i]);
        }
        while (players.size() > 1) {
            count++;
            for (int i = 0; i < n; i++) {
                String add = players.peek();
                players.poll();
                players.offer(add);
            }
            if (isPrime(count)) {
                System.out.printf("Prime %s\n", players.peek());
            } else {
                System.out.printf("Removed %s%n", players.poll());
            }
        }
        System.out.printf("Last is %s", players.peek());
    }

    private static boolean isPrime(int count) {
        if (count <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(count); i++) {
            if (count % i == 0) {
                return false;
            }
        }
        return true;
    }

}
