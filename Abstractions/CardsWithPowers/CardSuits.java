package Abstractions.CardsWithPowers;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    public int getPower() {
        return power;
    }

    CardSuits(int power) {
        this.power = power;
    }
}
