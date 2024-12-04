package java.basics.For.loop.exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double n5 = 0;
        for (int i = 1; i <=n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if(number<200){
                n1=n1+1;
            } else if (number<400) {
                n2=n2+1;
            } else if (number<600) {
                n3=n3+1;
            } else if (number<800) {
                n4=n4+1;
            } else if (number<=1000) {
                n5=n5+1;
            }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%",n1/n*100,n2/n*100,n3/n*100,n4/n*100,n5/n*100);

    }
}
