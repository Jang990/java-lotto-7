package lotto.winner;

public enum LottoRank {
    FIRST(2_000_000_000, 6, false),
    SECOND(30_000_000, 5,true),
    THIRD(1_500_000,5,false),
    FOURTH(50_000, 4, false),
    FIFTH(5_000, 3, false),
    FAIL(0, null, null);

    public final int price;
    public final Integer correct;
    public final Boolean bonus;

    LottoRank(int price, Integer correct, Boolean bonus) {
        this.price = price;
        this.correct = correct;
        this.bonus = bonus;
    }
}
