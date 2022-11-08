package jp.wings.pocket.chap5;


import java.nio.CharBuffer;

public class CharBuffGetSample {
	public static void main(String[] args) {
		char[] chars = { 'J', 'a', 'v', 'a' };
		CharBuffer cb = CharBuffer.allocate(10);
		// 書き込み
		cb.put(chars);
		// positionを先頭にする
		cb.rewind();
		for (int i = 0; i<4; i++) 
			System.out.print(cb.get());
	}
}
