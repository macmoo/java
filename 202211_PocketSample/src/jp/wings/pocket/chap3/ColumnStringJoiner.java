package jp.wings.pocket.chap3;

import java.util.StringJoiner;

public class ColumnStringJoiner {

	public static void main(String[] args) {

		// デリミタ、接頭辞、接尾辞を指定
		StringJoiner sj = new StringJoiner(",", "{", "}");

		// addメソッドで連結する文字列を設定する
		sj.add("data1").add("data2").add("data3");

		System.out.println(sj.toString()); // 結果：{data1,data2,data3}
	}
}
