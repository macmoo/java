package jp.wings.pocket.chap3;

//文字列バッファを検索し、指定した文字を設定します
public class SBSetCharSample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Javaは難しいですか？");
		sb.setCharAt(sb.indexOf("難"), '楽');
		System.out.println(sb);
	}
}

