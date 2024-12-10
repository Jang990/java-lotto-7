package lotto.winner;

import lotto.generator.Lotto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WinningNumbersTest {

    @Test
    void 당첨_여부_확인() {
        WinningNumbers winningNumbers = new WinningNumbers(new Lotto(List.of(1, 2, 3, 4, 5, 6)), 7);

        assertEquals(LottoResult.FIRST, winningNumbers.result(new Lotto(List.of(1, 2, 3, 4, 5, 6))));
        assertEquals(LottoResult.SECOND, winningNumbers.result(new Lotto(List.of(7, 2, 3, 4, 5, 6))));
        assertEquals(LottoResult.THIRD, winningNumbers.result(new Lotto(List.of(1, 2, 3, 4, 5, 16))));
        assertEquals(LottoResult.FOURTH, winningNumbers.result(new Lotto(List.of(1, 2, 3, 4, 15, 16))));
        assertEquals(LottoResult.FIFTH, winningNumbers.result(new Lotto(List.of(1, 2, 3, 14, 15, 16))));
        assertEquals(LottoResult.FAIL, winningNumbers.result(new Lotto(List.of(11, 12, 13, 14, 15, 16))));
    }

}