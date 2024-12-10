package lotto.generator;

import java.util.List;

class LottoNumberGeneratorStub extends LottoNumberGenerator {

    public static final LottoNumberGeneratorStub GENERATOR
            = new LottoNumberGeneratorStub(List.of(1, 2, 3, 4, 5, 6));

    private List<Integer> numbers;

    public LottoNumberGeneratorStub(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> generate() {
        return numbers;
    }
}