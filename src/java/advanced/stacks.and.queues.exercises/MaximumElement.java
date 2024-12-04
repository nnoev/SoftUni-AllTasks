package java.advanced.stacks.and.queues.exercises;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "1":
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int max = stack.stream().max(Comparator.naturalOrder()).orElse(0);
                    System.out.println(max);
                    break;
            }
        }
    }


}
