package jp.wings.pocket.chap3;

public class STCodepointSample2 {

	public static void main(String[] args) {
	    String str = "この𩸽𠮟はサロゲートペアです";

	    // コードポイント単位で先頭から5つ出力する
		for (int i=0; i<str.offsetByCodePoints(0,5); i=str.offsetByCodePoints(i,1)) {
			int codepoint = str.codePointAt(i);
			System.out.printf("%c [u+%h]%n", codepoint,codepoint);
		}
	}
}
