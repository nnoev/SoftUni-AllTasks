package JavaAdvanced.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BasicStackOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] line1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).forEach(stack::push);
        for (int i = 0; i <line1[1] ; i++) {
            stack.pop();
        }
        if(stack.contains(line1[2])){
            System.out.println(true);
        }else {
            if (stack.isEmpty()){
                System.out.println(0);
            }else {
                int min = stack.peek();
                for (Integer number : stack) {
                    if (number < min) {
                        min = number;
                    }
                }
                System.out.println(min);
            }
        }
    }

}
