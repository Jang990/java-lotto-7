package lotto.generator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LottoGeneratorTest {
    @Test
    void 로또_발행하기() {
        LottoNumberGeneratorStub numberGeneratorStub
                = new LottoNumberGeneratorStub(List.of(1, 2, 3, 4, 5, 6));
        LottoGenerator generator = new LottoGenerator(numberGeneratorStub);

        Lotto result = generator.generate();

        assertEquals("[1, 2, 3, 4, 5, 6]", result.toString());
    }
}