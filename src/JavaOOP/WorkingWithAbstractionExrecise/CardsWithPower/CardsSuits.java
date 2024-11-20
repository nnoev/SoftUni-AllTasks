package CardsWithPower;

public enum CardsSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    CardsSuits(int suits) {
        Suits = suits;
    }

    public int getSuits() {
        return Suits;
    }

    private int Suits;
}
