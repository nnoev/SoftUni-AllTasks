package JavaAdvanced.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> input = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("")).map(input::add).toList();
        while (!input.isEmpty()) {
            String test = (input.getFirst() + input.getLast());
            if (test.equals("[]")|| test.equals("()")|| test.equals("{}")) {
                input.remove(input.getFirst());
                input.remove(input.getLast());
            }else {
                break;
            }
        }
        if (input.isEmpty()){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }


}
