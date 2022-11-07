package jp.wings.pocket.chap3;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

// 各種のsetメソッドを使い、Calendarオブジェクトを設定します。
class CalendarSetMethods{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		System.out.println("今日の日付");
		dispDate(cal);
		//カレンダーについて各種設定をする
		System.out.println("2003.1.1にセット");
		cal.set(2003, 0, 1);
		dispDate(cal);
		System.out.println("Dateオブジェクトで再設定");
		cal.setTime(date);
		dispDate(cal);
		System.out.println("0ミリ秒を指定し、エポックに設定");
		cal.setTimeInMillis(0);
		dispDate(cal);
		System.out.println("週の最初を月曜日に設定");
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		if(cal.getFirstDayOfWeek() == Calendar.MONDAY){
			System.out.println("週の最初の曜日は月曜");
		}
		System.out.println("年の最初の週に必要な最小日数を7に設定");
		cal.setMinimalDaysInFirstWeek(7);
		System.out.println("年の最初の週に必要な日数は" + cal.getMinimalDaysInFirstWeek() + "日");
		System.out.println("アメリカ/ロスのタイムゾーンを設定");
		cal.setTimeZone(tz);
		System.out.println("タイムゾーンは" + cal.getTimeZone().getDisplayName());
	}
	//Calendarオブジェクトの日付を表示するメソッド
	private static void dispDate(Calendar cal){
		System.out.println(cal.get(Calendar.YEAR)+":" + (cal.get(Calendar.MONTH) + 1) + ":"+cal.get(Calendar.DATE));
	}
}
