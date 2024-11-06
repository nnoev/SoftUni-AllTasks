package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = 0;
        while (steps < 10000) {
            String text = scanner.nextLine();
            if (text.equals("Going home")) {
                int n = Integer.parseInt(scanner.nextLine());
                steps = steps + n;
                break;
            }
            int n = Integer.parseInt(text);
            steps = steps + n;
        }
        if (steps < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - steps);
        } else {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", steps - 10000);
        }

    }
}
