package jp.wings.pocket.chap5;


import java.nio.CharBuffer;

public class BFPrimitiveInfoSample {
	public static void main(String[] args) {
		char[] chars =
			{ 'P', 'o', 'c', 'k', 'e', 't',
				'R', 'e', 'f', 'e', 'r', 'e', 'n', 'c', 'e' };

		CharBuffer cb = CharBuffer.allocate(30);
		cb.put(chars);

		// バッファの情報を表示
		System.out.println("capacity: " + cb.capacity());
		System.out.println("length: " + cb.length());
		System.out.println("order: " + cb.order());
	}
}
