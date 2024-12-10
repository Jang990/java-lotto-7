package lotto.winner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LottoResultTest {

    @Test
    void 로또_결과_출력() {
        LottoResult result = new LottoResult(8_000, List.of(LottoRank.FIFTH, LottoRank.FAIL));
        System.out.println(result);
        assertEquals("""
                        당첨 통계
                        ---
                        6개 일치 (2,000,000,000원) - 0개
                        5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
                        5개 일치 (1,500,000원) - 0개
                        4개 일치 (50,000원) - 0개
                        3개 일치 (5,000원) - 1개
                        총 수익률은 62.5%입니다.
                        """,
                result.toString());
    }

}