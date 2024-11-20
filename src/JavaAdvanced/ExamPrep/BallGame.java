package JavaAdvanced.ExamPrep;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BallGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> strength = new ArrayDeque<>();
        ArrayDeque<Integer> accuracy = new ArrayDeque<>();
        String[] line1 = scanner.nextLine().split(" ");
        String[] line2 = scanner.nextLine().split(" ");
        int goals = 0;
        for (int i = 0; i < line1.length; i++) {
            strength.push(Integer.parseInt(line1[i]));
        }
        for (int i = 0; i < line2.length; i++) {
            accuracy.offer(Integer.parseInt(line2[i]));
        }
        while (!strength.isEmpty() && !accuracy.isEmpty()) {
            int sum = strength.peek() + accuracy.peek();
            if (sum == 100) {
                strength.pop();
                accuracy.poll();
                goals++;
            }

            if (sum < 100) {
                if (strength.peek() < accuracy.peek()) {
                    strength.pop();
                } else if (strength.peek() > accuracy.peek()) {
                    accuracy.poll();
                } else if (strength.peek() == accuracy.peek()) {
                    strength.push(strength.peek() + accuracy.peek());
                    accuracy.poll();
                }
            }
            if (sum > 100) {
                strength.push(strength.pop() - 10);
                accuracy.offer(accuracy.poll());
            }
        }
        switch (goals) {
            case 3:
                System.out.println("Paul scored a hat-trick!");
                break;
            case 0:
                System.out.println("Paul failed to score a single goal.");
                break;
            case 1, 2:
                System.out.println("Paul failed to make a hat-trick.");
                break;
            default:
                System.out.println("Paul performed remarkably well!");
                break;
        }
        System.out.printf("Goals scored: %d%n", goals);
        if (!strength.isEmpty()) {
            System.out.println("Strength values left: " + strength.toString().replaceAll("[\\[\\]]", ""));
        }
        if (!accuracy.isEmpty()) {
            System.out.println("Accuracy values left: " + accuracy.toString().replaceAll("[\\[\\]]", ""));
        }

    }
}