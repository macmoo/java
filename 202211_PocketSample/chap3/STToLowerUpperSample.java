package jp.wings.pocket.chap3;

import java.util.Locale;

//文字列を大文字／小文字に変換します。
public class STToLowerUpperSample {
	public static void main(String[] args) {
		String str = "EnJoY jAvA!!";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase(Locale.getDefault()));
	}
}
