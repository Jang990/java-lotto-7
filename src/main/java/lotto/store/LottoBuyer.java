package lotto.store;

import lotto.generator.Lotto;

import java.util.List;

public class LottoBuyer {
    private final List<Lotto> values;

    public LottoBuyer(List<Lotto> values) {
        this.values = values;
    }

    public int size() {
        return values.size();
    }
}
