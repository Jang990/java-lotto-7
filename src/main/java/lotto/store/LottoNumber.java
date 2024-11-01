package lotto.store;

import java.util.Objects;

public class LottoNumber {
    private int number;

    private static final int MIN_LOTTO_NUMBER = 1;
    private static final int MAX_LOTTO_NUMBER = 45;

    public LottoNumber(int number) {
        if(isOutOfRange(number))
            throw new IllegalArgumentException("로또 번호는 1~45 숫자여야 합니다.");
        this.number = number;
    }

    private boolean isOutOfRange(int num) {
        return num < MIN_LOTTO_NUMBER || MAX_LOTTO_NUMBER < num ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
