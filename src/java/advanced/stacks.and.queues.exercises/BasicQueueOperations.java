package java.advanced.stacks.and.queues.exercises;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deque.offer(scanner.nextInt());
        }
        for (int i = 0; i < s; i++) {
            deque.poll();
        }
        if (deque.contains(t)){
            System.out.println(true);
        }else {
            System.out.println(deque.stream().min(Comparator.naturalOrder()).orElse(0));
        }

    }


}
