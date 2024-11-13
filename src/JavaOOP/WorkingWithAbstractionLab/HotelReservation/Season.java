package JavaOOP.WorkingWithAbstractionLab.HotelReservation;

public enum Season {

    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);
    private int multy;

    Season(int multy) {
        this.multy = multy;
    }

    public int getMulty() {
        return multy;
    }
}
