package jp.wings.pocket.chap3;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
	public static void main(String[] args) {
		ZonedDateTime  date = ZonedDateTime .now(); // 現在日時
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy'年'MM'月'dd'日'");

		// formatメソッドで文字列に変換する
		System.out.println(date.format(df1));

		// 定義済みフォーマッタ
		DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(date.format(df2));

	}
}
