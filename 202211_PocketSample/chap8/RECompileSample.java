package jp.wings.pocket.chap8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RECompileSample {
	public static void main(String[] args) {
		String str = "ポケットJavaリファレンス";
		Pattern pattern = Pattern.compile(".*java.*", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str);
		System.out.println("判定文字列:" + str);
		Pattern pat = matcher.pattern(); // 正規表現エンジンからパターンの取得
		System.out.println("正規表現:" + pat.pattern());
		System.out.println("オプション:" + pattern.flags());
		System.out.println("マッチしたかどうか:" + matcher.matches());
	}
}
