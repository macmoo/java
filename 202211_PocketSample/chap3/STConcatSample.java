package jp.wings.pocket.chap3;

//文字列の連結／置換／分割を行います。
public class STConcatSample {
	public static void main(String[] args) {
		String str1 = " にんじん・たまねぎ・じゃがいも";
		String str2 = str1.concat("・ぶたにく");

		System.out.println(str2);
	}
}
