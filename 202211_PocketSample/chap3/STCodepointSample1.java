package jp.wings.pocket.chap3;

public class STCodepointSample1 {

	static void printHex( char[] cs) {
		for (char c : cs) {
			System.out.printf("0x%H ", (int) c);
		}
	}

	public static void main(String[] args) {
		String str = "この𩸽𠮟はサロゲートペアです";

		int codepoint = str.codePointAt(6);
		System.out.printf("%c [u+%h] ", codepoint,codepoint);
        STCodepointSample1.printHex(Character.toChars(codepoint));
		System.out.println();

		codepoint = str.codePointBefore(4);
		System.out.printf("%c [u+%h] ", codepoint,codepoint);
        STCodepointSample1.printHex(Character.toChars(codepoint));
		System.out.println();
	}
}
