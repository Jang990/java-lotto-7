package lotto.winner;

import lotto.generator.Lotto;

public class WinningNumbers {
    private final Lotto winningLotto;
    private final int bonusNumber;

    public WinningNumbers(Lotto winningLotto, int bonusNumber) {
        this.winningLotto = winningLotto;
        this.bonusNumber = bonusNumber;
    }

    public LottoRank rank(Lotto lotto) {
        int containsNumber = winningLotto.countContainsNumber(lotto);
        boolean hasBonusNumber = lotto.contains(bonusNumber);

        for (LottoRank result : LottoRank.values()) {
            if(result.equals(LottoRank.FAIL)) continue;

            if(containsNumber == result.correct
                    && hasBonusNumber == result.bonus)
                return result;
        }

        return LottoRank.FAIL;
    }
}
