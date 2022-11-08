package jp.wings.pocket.chap3;


public class SBInsertSample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("今年は年です");
		System.out.println(sb.insert(3, 2016));
	}
}
