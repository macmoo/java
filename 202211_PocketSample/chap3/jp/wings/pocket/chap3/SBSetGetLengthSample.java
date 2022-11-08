package jp.wings.pocket.chap3;

//文字列の長さを取得し、指定した長さに変更します。
public class SBSetGetLengthSample {
	public static void main(String[] args) {
		//文字列の長さを取得し、指定した長さに変更する 
		StringBuilder sb = new StringBuilder(
		    "Javaは楽しいですか？Javaマスターになりましょう。");
		System.out.println("文字列の長さ：" + sb.length());
		// 結果：文字列の長さ：28 
		sb.setLength(sb.lastIndexOf("Java"));
		System.out.println(sb);
		// 結果：Javaは楽しいですか？ 
		System.out.println("文字列の長さ："
		    + sb.codePointCount(0, sb.lastIndexOf("？")));
		// 結果：文字列の長さ：11
	}
}
