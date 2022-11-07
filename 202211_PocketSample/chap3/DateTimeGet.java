package jp.wings.pocket.chap3;

import java.time.LocalDateTime;

public class DateTimeGet {
	public static void main(String[] args) {

		// 2016年2月14日12時30分10秒99に設定する
		LocalDateTime date = LocalDateTime.of(2016,2,14,12,30,10,99);
		System.out.println(date);
		// 各要素の表示
		System.out.println("getYear : " + date.getYear());
		System.out.println("getMonth : " + date.getMonth());
		System.out.println("getMonthValue : " + date.getMonthValue());
		System.out.println("getDayOfMonth : " + date.getDayOfMonth());
		System.out.println("getDayOfWeek : " + date.getDayOfWeek());
		System.out.println("getDayOfYear : " + date.getDayOfYear());
		System.out.println("getHour : " + date.getHour());
		System.out.println("getMinute : " + date.getMinute());
		System.out.println("getSecond : " + date.getSecond());
		System.out.println("getNano : " + date.getNano());
	}
}
