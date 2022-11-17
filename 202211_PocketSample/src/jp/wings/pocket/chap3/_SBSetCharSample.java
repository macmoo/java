package jp.wings.pocket.chap3;

import java.util.StringJoiner;

//文字列バッファを検索し、指定した文字を設定します
public class _SBSetCharSample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Javaは難しいですか？");
		sb.setCharAt(sb.indexOf("難"), '楽'); // **
		System.out.println(sb);
		// -------------------------------
		StringJoiner sj = new StringJoiner(",", "{", "}");
		sj.add("test1").add("test2").add("test3");
		System.out.println(sj.toString()); // {test1,test2,test3}
	}
}

