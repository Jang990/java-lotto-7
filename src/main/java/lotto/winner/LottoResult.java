package lotto.winner;

import java.util.List;

public class LottoResult {
    private final int seedMoney;
    private final List<LottoRank> ranks;

    public LottoResult(int seedMoney, List<LottoRank> ranks) {
        this.seedMoney = seedMoney;
        this.ranks = ranks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("""
                당첨 통계
                ---
                """);

        for (LottoRank rank : LottoRank.values()) {
            if(rank.equals(LottoRank.FAIL))
                continue;
            sb.append(createRankString(rank));
        }
        sb.append("총 수익률은 ")
                .append("%.1f".formatted(calculateRate()))
                .append("%입니다.\n");

        return sb.toString();
    }

    private float calculateRate() {
        return (float) sumPrice() / seedMoney * 100;
    }

    private int sumPrice() {
        int result = 0;
        for (LottoRank rank : ranks) {
            result += count(rank) * rank.price;
        }
        return result;
    }

    private String createRankString(LottoRank rank) {
        if (rank.bonus) {
            return "%d개 일치, 보너스 볼 일치 (%,3d원) - %d개\n".formatted(rank.correct, rank.price, count(rank));
        }
        return "%d개 일치 (%,3d원) - %d개\n".formatted(rank.correct, rank.price, count(rank));
    }

    private int count(LottoRank rank) {
        return (int) ranks.stream().filter(rank::equals).count();
    }
}
