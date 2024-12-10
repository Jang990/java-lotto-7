package lotto.generator;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class LottoNumberGenerator {

    protected static final int LOTTO_NUMBER_MIN = 1;
    protected static final int LOTTO_NUMBER_MAX = 45;
    protected static final int LOTTO_NUMBER_SIZE = 6;

    public List<Integer> generate() {
        return Randoms
                .pickUniqueNumbersInRange(
                        LOTTO_NUMBER_MIN,
                        LOTTO_NUMBER_MAX,
                        LOTTO_NUMBER_SIZE
                );
    }
}
