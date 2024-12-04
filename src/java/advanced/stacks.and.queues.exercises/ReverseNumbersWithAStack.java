package java.advanced.stacks.and.queues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String number : input){
            stack.push(Integer.parseInt(number));
        }

        System.out.println(String.valueOf(stack).replaceAll("[\\[\\],]",""));
    }


}
