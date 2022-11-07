package jp.wings.pocket;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodSample {

	public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2016, 2, 14);
        LocalDate d2 = LocalDate.of(2016, 12, 25);

        // バレンタインデー～クリスマスまでの期間を表示する
        System.out.println(Period.between(d1, d2));
        // 結果：P10M11D　（10ヶ月と11日の意味）
        // 月数
        System.out.println(Period.between(d1, d2).getMonths()); // 結果：10
        // 日数
        System.out.println(Period.between(d1, d2).getDays());     // 結果：11

        // 総日数を求めるには、ChronoUnitを利用する
        System.out.println(ChronoUnit.DAYS.between(d1, d2));    // 結果：315
	}

}
