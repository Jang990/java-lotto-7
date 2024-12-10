package lotto.store;

import lotto.generator.Lotto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LottoBuyerTest {

    @Test
    void 무엇을_구매했는지_파악할_수_있다() {
        List<Lotto> lottos = List.of(
                new Lotto(List.of(1, 2, 3, 4, 5, 6)),
                new Lotto(List.of(2, 3, 4, 5, 6, 7))
        );

        assertEquals("""
                2개를 구매했습니다.
                [1, 2, 3, 4, 5, 6]
                [2, 3, 4, 5, 6, 7]
                """, new LottoBuyer(2_000, lottos).toString());
    }

}