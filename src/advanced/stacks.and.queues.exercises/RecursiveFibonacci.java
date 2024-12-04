package advanced.stacks.and.queues.exercises;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        mem = new long[n+1];
        System.out.println(getFibonacci(n));
    }
    private  static long[] mem;

    private static long getFibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        if (mem[n]!=0){
            return mem[n];
        }else {
            mem[n]=getFibonacci(n-1)+getFibonacci(n-2);
        }
        return mem[n];
    }


}
