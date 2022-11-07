package jp.wings.pocket.chap8;

import java.text.DateFormat;
import java.util.Date;

// 日付／時刻をフォーマットするオブジェクトを生成し各フォーマットで出力
public class DFGetInstanceSample {
	public static void main(String[] args) {
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.DEFAULT);
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.FULL);
		DateFormat df3 =
			DateFormat.getDateTimeInstance(
					DateFormat.LONG,
					DateFormat.MEDIUM);
		DateFormat df4 = DateFormat.getInstance();

		System.out.println(df1.format(new Date()));
		System.out.println(df2.format(new Date()));
		System.out.println(df3.format(new Date()));
		System.out.println(df4.format(new Date()));
	}
}
