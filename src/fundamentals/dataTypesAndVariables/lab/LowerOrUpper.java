package fundamentals.dataTypesAndVariables.lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        if (letter.hashCode()>=65 && letter.hashCode()<=95){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }


}
