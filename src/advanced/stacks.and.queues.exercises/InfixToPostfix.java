package stacks.and.queues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<Integer> numbersDeque =  new ArrayDeque<>();
        ArrayDeque<Character> operations = new ArrayDeque<>();
        for (String item : input){
            if (item.matches("[0-9]+")){
                numbersDeque.offer(Integer.parseInt(item));
            }else {
                if (item.matches("[()]")){
                    continue;
                }else {
                    operations.push(item.charAt(0));
                }
            }
        }
        for (Integer number : numbersDeque){
            System.out.print(number+" ");
        }
        for (Character op : operations){
            System.out.print(op + " ");
        }
    }


}
