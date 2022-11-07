package jp.wings.pocket.chap5;

import java.nio.CharBuffer;

public class BFCreateSample {
	public static void main(String[] args) {

		// Char型のバッファを生成
		CharBuffer cb = CharBuffer.wrap("This is sample CharBuffer.");
		for (int i = 0; i < 8; i++) {
			System.out.print(cb.get()); // 結果：This is
		}
		System.out.println();

		CharBuffer sub = cb.slice(); // 9バイト目以降を取得
		int n = sub.length();
		for (int i = 0; i < n; i++) {
			System.out.print(sub.get());	//結果：sample CharBuffer.
		}
		System.out.println();




	}
}
