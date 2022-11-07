package jp.wings.pocket.chap8;

import java.text.DateFormat;
import java.text.ParseException;

// 文字列をDateオブジェクトに変換し、出力
public class DFParseSample {
	public static void main(String[] args) {
		try {
			DateFormat df = DateFormat.getInstance();
			System.out.println(df.parse("2015/10/31 6:42です。"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
