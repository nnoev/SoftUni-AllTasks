package working.with.abstraction.lab.hotel.reservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // "{pricePerDay} {numberOfDays} {season} {discountType}",
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        double price = Double.parseDouble(data[0]);
        int days = Integer.parseInt(data[1]);
        Season season = Season.valueOf(data[2]);
        DiscountType discount = DiscountType.valueOf(data[3]);
        System.out.printf("%.2f",PriceCalculator.pricecalc(price,days,season,discount));
    }
}
