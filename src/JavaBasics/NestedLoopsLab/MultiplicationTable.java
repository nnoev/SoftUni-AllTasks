package JavaBasics.NestedLoopsLab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i<=10;i++){
            for (int b = 1; b<=10;b++){
                System.out.printf("%d * %d = %d%n",i,b,i*b);
            }
        }

    }
}
