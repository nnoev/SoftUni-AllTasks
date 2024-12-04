package working.with.abstraction.lab.hotel.reservation;

public class PriceCalculator {

    public static double pricecalc(double price, int days, Season season, DiscountType discount) {
        double priceBase = price*days*season.getMulty()*discount.getDics();
        return priceBase;
    }
}

