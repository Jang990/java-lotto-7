package lotto.generator;

public class LottoGenerator {
    private final LottoNumberGenerator numberGenerator;

    public LottoGenerator(LottoNumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Lotto generate() {
        return new Lotto(numberGenerator.generate());
    }
}
