package jp.wings.pocket.chap3;

import java.util.Calendar;

//Calendarオブジェクト同士を比較します。
class CompareCalendarObjects{
	public static void main(String[] args){
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.YEAR, 1); //cal2に1年加える
		//Calendarオブジェクト同士を各種比較
		System.out.println("cal1 is equal cal2 ?:" + cal1.equals(cal2));
		System.out.println("cal1 is after cal2 ?:" + cal1.after(cal2));
		System.out.println("cal1 is before cal2 ?:" + cal1.before(cal2));
	}
}
