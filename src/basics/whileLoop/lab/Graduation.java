package basics.whileLoop.lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int fail = 0;
        int clas = 1;
        double sum = 0;
        while (clas<=12) {
            if (fail>1){
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade<4){
                fail++;
                continue;
            }
            sum = sum + grade;
            clas++;
        }
        if (fail<2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        }else {
            System.out.printf("%s has been excluded at %d grade",name,clas);
        }

    }
}
