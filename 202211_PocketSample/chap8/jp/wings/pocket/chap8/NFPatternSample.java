package jp.wings.pocket.chap8;

import java.text.DecimalFormat;

//数値をパターンでフォーマットする
public class NFPatternSample {
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.#");

		double a = 1.5D;
		System.out.println(df.format(a));

		df.applyLocalizedPattern("000.00");
		System.out.println(df.format(a));

		a = 1000000D;
		// 通貨記号＋3桁区切り
		df.applyLocalizedPattern("\u00A4,###");
		System.out.println(df.format(a));
	}
}
