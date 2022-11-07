package jp.wings.pocket.chap3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

//Calendarオブジェクトを取得し、日付を表示します。
class GetCalendarData{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		System.out.println("今日の日付");

		// Calendarオブジェクトにある情報をクラス定数を利用して取得
		// MONTHから取得できる月は0から始まることに注意
		System.out.println(cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.DATE));

		Calendar cal2 = Calendar.getInstance(Locale.FRANCE);
		// "週の最初の曜日と日曜を比較
		System.out.println(cal2.getFirstDayOfWeek() == Calendar.SUNDAY);

		// GregorianCalendar作成
		GregorianCalendar gcal = new GregorianCalendar(1966,5,22);
		System.out.println(gcal.get(Calendar.YEAR) + "/" + (gcal.get(Calendar.MONTH) + 1) + "/" + gcal.get(Calendar.DATE));



	}
}
