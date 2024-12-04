package advanced.stacks.and.queues.lab;
import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] text = input.split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i = text.length-1; i >= 0; i--) {
            stack.push(text[i]);
        }
        while (stack.size()>1) {
            int sum =0;
            int firstNumber = Integer.parseInt(stack.pop());
            String action = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());
            if (action.equals("-")) {
                sum = firstNumber - secondNumber;
            }
            if (action.equals("+")) {
                sum = firstNumber + secondNumber;
            }
            stack.push(String.valueOf(sum));
        }
        System.out.println(stack.peek());
    }
}
