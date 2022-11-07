package jp.wings.pocket;

import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.chrono.JapaneseEra;

public class JapaneseDateSample {

	public static void main(String[] args) {

		// 現在時刻
		System.out.println(JapaneseDate.now());
		// 結果：Japanese Heisei 28-02-21

		// 西暦から生成する
		JapaneseDate s = JapaneseDate.of(1989, 1, 7);
		System.out.println(s); // 結果：Japanese Showa 64-01-07

		// 元号から生成する
		System.out.println(JapaneseDate.of(JapaneseEra.HEISEI, 1, 1, 8));
		// 結果：Japanese Heisei 1-01-08

		// フォーマットする
		DateTimeFormatter df = DateTimeFormatter.ofPattern("Gy年MM月dd日");
		System.out.println(s.format(df)); // 結果：昭和64年01月07日

	}

}
