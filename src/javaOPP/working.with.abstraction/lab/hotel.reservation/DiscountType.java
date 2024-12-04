package lab.hotel.reservation;

public enum DiscountType {
    VIP(0.8),
    SecondVisit(0.9),
    None(1);

    private final double dics;

    DiscountType(double dics) {
        this.dics = dics;
    }

    public double getDics() {
        return dics;
    }
}
