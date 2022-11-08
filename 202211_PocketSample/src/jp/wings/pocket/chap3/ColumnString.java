package jp.wings.pocket.chap3;

public class ColumnString {

	public static void main(String[] args) {
		// 文字列の初期化
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");

		// 同じインスタンスになる
		System.out.println(str1 == str2); // 結果：true

		// 異なるインスタンスになる
		System.out.println(str2 == str3); // 結果：false
	}
}
