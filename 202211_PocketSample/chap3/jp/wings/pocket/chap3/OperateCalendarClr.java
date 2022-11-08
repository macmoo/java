package jp.wings.pocket.chap3;

import java.util.Calendar;

// Calendarオブジェクトのフィールド値をクリアする
public class OperateCalendarClr{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		System.out.println("現在時刻");
		dispTime(cal);
		System.out.println("時間フィールドの分の値をクリア");
		cal.clear(Calendar.MINUTE);
		dispTime(cal);
	}

	//カレンダーの時刻を表示するメソッド
	private static void dispTime(Calendar cal){
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":"
			+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
	}
}