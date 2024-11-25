package Test1.BallGame;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] line1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] line2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> strength = new ArrayDeque<>();
        ArrayDeque<Integer> accuracy = new ArrayDeque<>();
        int goals = 0;
        for (Integer number : line1) {
            strength.push(number);
        }
        for (Integer number : line2) {
            accuracy.offer(number);
        }
        while (!strength.isEmpty() && !accuracy.isEmpty()) {
            int currentStrength = strength.peek();
            int currentAccuracy = accuracy.peek();
            int sum = currentStrength + currentAccuracy;
            if (sum == 100) {
                goals++;
                strength.pop();
                accuracy.poll();
            } else if (sum < 100) {
                if (currentStrength < currentAccuracy) {
                    strength.pop();
                }
                if (currentStrength > currentAccuracy) {
                    accuracy.poll();
                }
                if (currentStrength == currentAccuracy) {
                    strength.pop();
                    accuracy.poll();
                    strength.push(sum);
                }
            } else if (sum > 100) {
                currentStrength -= 10;
                strength.pop();
                strength.push(currentStrength);
                accuracy.offer(accuracy.poll());
            }
        }
        if (goals == 3) {
            System.out.println("Paul scored a hat-trick!");
        }
        if (goals == 0) {
            System.out.println("Paul failed to score a single goal.");
        }
        if (goals > 3) {
            System.out.println("Paul performed remarkably well!");
        }
        if (goals > 0 && goals < 3) {
            System.out.println("Paul failed to make a hat-trick.");
        }
        System.out.printf("Goals scored: %d%n",goals);
        if (!strength.isEmpty()){
            String[] left1 = strength.stream().map(String::valueOf).toArray(String[]::new);
            System.out.printf("Strength values left: %s", Arrays.stream(left1));
        }
        if (!accuracy.isEmpty()){
            String left = accuracy.toString().replaceAll("[\\[\\]]","");
            System.out.printf("Accuracy values left: %s",left);
        }
    }
}
