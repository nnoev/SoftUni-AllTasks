package JavaBasics.WhileLoopLab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        while (!text.equals("Stop")){
            int number = Integer.parseInt(text);
            if (number>max){
                max=number;
            }
            text = scanner.nextLine();
        }
        System.out.println(max);
    }
}
