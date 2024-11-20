package JavaAdvanced.ExamPrep;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class WildSurvival {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> bees = new ArrayDeque<>();
        Stack<Integer> beeEater = new Stack<>();
        String[] line1 = scanner.nextLine().split(" ");
        String[] line2 = scanner.nextLine().split(" ");
        for (String number : line1) {
            bees.offer(Integer.parseInt(number));
        }
        for (String number : line2) {
            beeEater.push(Integer.parseInt(number));
        }
        while (!bees.isEmpty() && !beeEater.isEmpty()) {
            int beesProtect = bees.peek();
            int bessAttackers = beeEater.peek();
            while (bessAttackers > 0 && beesProtect > 0) {
                beesProtect -= 7;
                bessAttackers -= 1;
            }
            if (bessAttackers > beesProtect) {
                if (beesProtect < 0) {
                    bessAttackers++;
                }
                bees.poll();
                beeEater.pop();
                beeEater.push(bessAttackers);
            }
            if (beesProtect > bessAttackers) {
                bees.poll();
                beeEater.pop();
                bees.offer(beesProtect);
            }
            if (beesProtect == bessAttackers) {
                bees.poll();
                beeEater.pop();
            }
            System.out.println();
        }
        System.out.println("The final battle is over!");
        if (bees.isEmpty() && beeEater.isEmpty()) {
            System.out.println("But no one made it out alive!");
        }
        if (!bees.isEmpty()) {
            System.out.printf("Bee groups left: %s",bees.toString().replaceAll("[\\[\\]]", ""));
        }
        if (!beeEater.isEmpty()) {
            System.out.printf("Bee-eater groups left: %s",beeEater.toString().replaceAll("[\\[\\]]", ""));
        }
    }
}