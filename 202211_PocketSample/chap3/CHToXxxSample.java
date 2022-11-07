package jp.wings.pocket.chap3;

//指定された文字を大文字／小文字に変換します。
public class CHToXxxSample {
	public static void main(String[] args) {
		System.out.println("Aを小文字に変換：" + Character.toLowerCase('A'));
		System.out.println("zを大文字に変換：" + Character.toUpperCase('z'));
		System.out.println("lをタイトルケース文字に変換：" + Character.toTitleCase('l'));
	}
}
