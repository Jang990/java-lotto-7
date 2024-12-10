package lotto.winner;

import lotto.generator.Lotto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WinningNumbersTest {

    @Test
    void 당첨_여부_확인() {
        WinningNumbers winningNumbers = new WinningNumbers(new Lotto(List.of(1, 2, 3, 4, 5, 6)), 7);

        assertEquals(LottoRank.FIRST, winningNumbers.rank(new Lotto(List.of(1, 2, 3, 4, 5, 6))));
        assertEquals(LottoRank.SECOND, winningNumbers.rank(new Lotto(List.of(7, 2, 3, 4, 5, 6))));
        assertEquals(LottoRank.THIRD, winningNumbers.rank(new Lotto(List.of(1, 2, 3, 4, 5, 16))));
        assertEquals(LottoRank.FOURTH, winningNumbers.rank(new Lotto(List.of(1, 2, 3, 4, 15, 16))));
        assertEquals(LottoRank.FIFTH, winningNumbers.rank(new Lotto(List.of(1, 2, 3, 14, 15, 16))));
        assertEquals(LottoRank.FAIL, winningNumbers.rank(new Lotto(List.of(11, 12, 13, 14, 15, 16))));
    }

}