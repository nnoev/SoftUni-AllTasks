package working.with.abstraction.lab.hotel.reservation;

public enum Season {

    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);
    private final int multy;

    Season(int multy) {
        this.multy = multy;
    }

    public int getMulty() {
        return multy;
    }
}
