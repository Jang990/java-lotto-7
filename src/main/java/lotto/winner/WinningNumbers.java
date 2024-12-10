package lotto.winner;

import lotto.generator.Lotto;

public class WinningNumbers {
    private final Lotto winningLotto;
    private final int bonusNumber;

    public WinningNumbers(Lotto winningLotto, int bonusNumber) {
        this.winningLotto = winningLotto;
        this.bonusNumber = bonusNumber;
    }

    public LottoResult result(Lotto lotto) {
        int containsNumber = winningLotto.countContainsNumber(lotto);
        boolean hasBonusNumber = lotto.contains(bonusNumber);

        for (LottoResult result : LottoResult.values()) {
            if(result.equals(LottoResult.FAIL)) continue;

            if(containsNumber == result.correct
                    && hasBonusNumber == result.bonus)
                return result;
        }

        return LottoResult.FAIL;
    }
}
