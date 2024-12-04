package fundamentals.basic.syntax.conditional.statements.and.loops.more.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        List<Integer>numbers = new ArrayList<>();
        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        Collections.sort(numbers.reversed());
        for (Integer number : numbers){
            System.out.println(number);
        }
    }


}
