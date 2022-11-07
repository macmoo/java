package jp.wings.pocket.chap8;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.TimeZone;

public class DFGetSetSample {
	public static void main(String[] args) throws ParseException{

		DateFormat df = DateFormat.getInstance();

		// 寛容な解析
		df.setLenient(true);
		System.out.println("2015/11/31 12:34 is " + df.parse("2015/11/31 12:34"));

		df.setCalendar(Calendar.getInstance());
		df.setNumberFormat(NumberFormat.getInstance());
		df.setTimeZone(TimeZone.getDefault());
		// 現在日時
		System.out.println(df.getCalendar().getTime());
		// 数値のフォーマッタにおける通貨記号
		System.out.println(df.getNumberFormat().getCurrency());
		// タイムゾーン名
		System.out.println(df.getTimeZone().getDisplayName());
	}
}
