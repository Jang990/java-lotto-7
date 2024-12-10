package lotto.store;

import lotto.generator.Lotto;
import lotto.generator.LottoGenerator;

import java.util.LinkedList;
import java.util.List;

public class LottoStore {
    private static final int LOTTO_PRICE = 1_000;
    private static final String LOTTO_MONEY_ERROR = "잔돈이 발생합니다.";

    private final LottoGenerator lottoGenerator;


    public LottoStore(LottoGenerator lottoGenerator) {
        this.lottoGenerator = lottoGenerator;
    }

    public LottoBuyer buy(int money) {
        if(money % LOTTO_PRICE != 0)
            throw new IllegalArgumentException(LOTTO_MONEY_ERROR);

        int cnt = money / LOTTO_PRICE;
        return new LottoBuyer(generate(cnt));
    }

    private List<Lotto> generate(int cnt) {
        List<Lotto> result = new LinkedList<>();
        for (int i = 0; i < cnt; i++) {
            result.add(lottoGenerator.generate());
        }
        return result;
    }
}
