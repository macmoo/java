package jp.wings.pocket.chap3;

import java.util.Calendar;

// Calendarオブジェクトが示す日付に対し、時間の加算などの操作を行う
public class OperateCalendar{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();

		// 現在時刻
		dispTime(cal);

		// -65分加算
		cal.add(Calendar.MINUTE, -65);
		dispTime(cal);

		// 秒の値をローリング
		cal.roll(Calendar.SECOND, true);
		dispTime(cal);
	}
	//カレンダーの時刻を表示するメソッド
	private static void dispTime(Calendar cal){
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":"
			+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
	}
}