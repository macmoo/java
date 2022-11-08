package jp.wings.pocket.chap8;

import java.text.NumberFormat;

//数値をフォーマットする
public class NFFormatSample {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();

		System.out.println(nf.format(5/3));
		System.out.println(nf.format(5.0/3.0));
	}
}

