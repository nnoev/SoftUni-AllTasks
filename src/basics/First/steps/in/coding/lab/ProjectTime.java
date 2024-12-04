package basics.First.steps.in.coding.lab;

import java.util.Scanner;

public class ProjectTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name,n*3,n);
    }
}
