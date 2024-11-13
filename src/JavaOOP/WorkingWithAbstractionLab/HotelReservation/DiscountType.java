package JavaOOP.WorkingWithAbstractionLab.HotelReservation;

public enum DiscountType {
    VIP(0.8),
    SecondVisit(0.9),
    None(1);

    private double dics;

    DiscountType(double dics) {
        this.dics = dics;
    }

    public double getDics() {
        return dics;
    }
}
