package jp.wings.pocket.chap3;

//文字列の一部分を取得し、出力します。
public class SBSubstringSample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello World!!");
		System.out.println(sb.subSequence(0, 5));
		System.out.println(sb.substring(6));
	}
}
