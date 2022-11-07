package jp.wings.pocket.chap8;

import java.text.DateFormat;
import java.util.Date;

// フォーマットする前と後のDateオブジェクトを出力
public class DFFormatSample {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getInstance();
		System.out.println("そのまま出力：" + new Date());
		System.out.println("フォーマット後：" + df.format(new Date()));
	}
}
