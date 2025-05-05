package fundamentals.basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a= scanner.nextLine();
        String b= scanner.nextLine();
        String c= scanner.nextLine();
        System.out.printf("Name: %s, Age: %s, Grade: %s",a,b,c);

    }
}
