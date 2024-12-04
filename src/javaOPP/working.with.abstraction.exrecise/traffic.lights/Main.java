package working.with.abstraction.exrecise.traffic.lights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int [] ordinals = new int[input.length];
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (String signal:input){
            int ordinal = Lights.valueOf(signal).ordinal();
            ordinals[count]=ordinal;
            count++;
        }
        for (int j = 0; j < n; j++) {

            for (int i = 0; i <= ordinals.length - 1; i++) {
                ordinals[i]++;
                if (ordinals[i] > 2) {
                    ordinals[i] = 0;
                }
            }
            for (int index : ordinals){
                System.out.printf("%s ",Lights.values()[index]);
            }
            System.out.println();
        }
    }
}
