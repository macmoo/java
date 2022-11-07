package jp.wings.pocket.chap3;

import java.util.Date;

// Dateオブジェクトを使い、日付データを色々な方法で比較
class CompareDateObjects{
	public static void main(String[] args){
		Date date1 = new Date();
		// 現在時刻に1000ミリ秒プラス
		Date date2 = new Date(date1.getTime() + 1000);
		System.out.println(date1.after(date2));			// 結果：false
		System.out.println(date1.before(date2));		// 結果：true
		System.out.println(date1.equals(date2));		// 結果：false
		System.out.println(date1.compareTo(date2));	// 結果：-1
	}
}
