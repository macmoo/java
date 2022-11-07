package jp.wings.pocket.chap3;

//文字列の一部分を取得します。
public class STSubStringSample {
	public static void main(String[] args) {
		String str = "Hello World!!";
		System.out.println(str.subSequence(0, 5));
		System.out.println(str.substring(6));
	}
}
