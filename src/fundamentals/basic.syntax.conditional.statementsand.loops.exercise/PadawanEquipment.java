package fundamentals.basic.syntax.conditional.statementsand.loops.exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget =Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsaber =Double.parseDouble(scanner.nextLine());
        double priceRobes =Double.parseDouble(scanner.nextLine());
        double priceBelts =Double.parseDouble(scanner.nextLine());
        int lightSabers = (int) Math.ceil(students*1.1);
        int discountOfBelts = students/6;
        double sum = lightSabers*priceLightsaber+students*priceRobes+students*priceBelts-discountOfBelts*priceBelts;
        if (sum<=budget){
            System.out.printf("The money is enough - it would cost %.2flv.",sum);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",sum-budget);
        }
    }
}
