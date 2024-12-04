package advanced.stacks.and.queues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        ArrayDeque<Integer> indexes = new ArrayDeque<>();
        for (int i = 0; i <= text.length()-1; i++) {
            if (text.charAt(i) == '(') {
                indexes.push(i);
            }else if (text.charAt(i) == ')') {
                int first = indexes.pop();
                String subtext = text.substring(first,i+1);
                System.out.println(subtext);
            }
        }
    }
}
