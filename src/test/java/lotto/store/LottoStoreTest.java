package lotto.store;

import lotto.generator.LottoGenerator;
import lotto.generator.LottoNumberGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoStoreTest {

    private final LottoStore store = new LottoStore(new LottoGenerator(new LottoNumberGenerator()));

    @Test
    void 로또_구매_시_맞아떨어지지_않으면_예외발생() {
        assertThrows(IllegalArgumentException.class, () -> store.buy(1234));
    }

    @Test
    void 로또_구매는_1000원_단위로_이뤄짐() {
        LottoBuyer result = store.buy(5000);
        assertEquals(5, result.size());
    }

}