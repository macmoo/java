package jp.wings.pocket.chap3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

//各種getメソッドを使い、Calendarクラスの設定を取得します。
class CalendarGetMethods{
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();
		GregorianCalendar gcal = new GregorianCalendar();
		//グレゴリウス暦の各設定を表示する
		System.out.println("ActualMaxmum:" + cal.getActualMaximum(Calendar.DATE));
		System.out.println("ActualMinimum:" + cal.getActualMinimum(Calendar.DATE));
		System.out.println("FirstDayOfWeek:" + cal.getFirstDayOfWeek());
		System.out.println("MinimalDaysInFirstWeek:" + cal.getMinimalDaysInFirstWeek());
		System.out.println("Date:" + cal.getTime().toString());
		System.out.println("TimeInMillis:" + cal.getTimeInMillis());
		System.out.println("TimeZone:" + cal.getTimeZone());
		System.out.println("GreatestMinimumOfDate:" + gcal.getGreatestMinimum(Calendar.DATE));
		System.out.println("LeastMaximumOfDate:" + gcal.getLeastMaximum(Calendar.DATE));
		System.out.println("MinimumOfMonth:" + gcal.getMinimum(Calendar.MONTH));
		System.out.println("MaximumOfMonth:" + gcal.getMaximum(Calendar.MONTH));
		Locale[] locale = Calendar.getAvailableLocales();
		//ロケールを表示用の表記で羅列する
		for(int i = 0; i < locale.length; i++){
			System.out.println("Locale" + i + ":" + locale[i].getDisplayCountry());
		}
	}
}
