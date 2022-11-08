package jp.wings.pocket.chap3;

public class ColumnTrim {

	public static void main(String[] args) {
		String str = "　　全角空白　のトリム 　";

		System.out.println("[" + str + "]"); // 結果：[　　全角空白　のトリム 　]

		// 先頭の空白文字を削除
		str = str.replaceAll("^[　|\\s]*", "");
		// 最後の空白文字を削除
		str = str.replaceAll("[　|\\s]*$", "");

		System.out.println("[" + str + "]"); // 結果：[全角空白　のトリム]
	}
}
