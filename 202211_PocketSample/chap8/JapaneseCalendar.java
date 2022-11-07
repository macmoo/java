package jp.wings.pocket.chap8;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class JapaneseCalendar {
	public static void main(String args[]){

		// 和暦のロケール
		Locale jaJPJP = new Locale("ja", "JP", "JP");

		// ロケールIDの表示
		System.out.println(jaJPJP);

		// 和暦のDateFormat
		DateFormat df =
			DateFormat.getDateInstance(DateFormat.FULL, jaJPJP);

		DateFormat df2 =
			DateFormat.getDateInstance(DateFormat.SHORT, jaJPJP);

		// 現在の日付を和暦表示
		Date today = new Date();
		System.out.println(df.format(today));
		System.out.println(df2.format(today));

		// 和暦表示からパース
		try {
			System.out.println(df.parse("昭和41年5月22日"));
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
