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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("%d개를 구매했습니다.".formatted(size())).append("\n");
        for (Lotto value : values) {
            sb.append(value).append("\n");
        }
        return sb.toString();
    }
}
