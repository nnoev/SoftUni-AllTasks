package JavaAdvanced.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

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
