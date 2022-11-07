package jp.wings.pocket.chap8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// 日付／時刻をパターンでフォーマット
public class DFSimpleDateFormatSample {
	public static void main(String[] args) {

		Date today = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'年'MM'月'dd'日'");
		System.out.println(sdf.format(today));

		sdf.applyPattern("hh 'o''clock' a, zzzz");
		System.out.println(sdf.format(today));

		SimpleDateFormat jsdf = 
			new SimpleDateFormat("GGGG'の略語は'G",new Locale("ja", "JP", "JP"));
		System.out.println(jsdf.format(today));
	}
}
