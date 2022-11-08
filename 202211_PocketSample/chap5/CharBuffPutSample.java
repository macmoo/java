

import java.nio.CharBuffer;

public class CharBuffPutSample {
	public static void main(String[] args) {
		char[] chars = { 'H', 'e', 'l', 'l', 'o', '!' };
		CharBuffer cb = CharBuffer.wrap(chars);

		int size = cb.length();
		for (int i = 0; i < size; i++) {
			int posi = cb.position();
			char c = Character.toUpperCase(cb.get());
			cb.put(posi, c);
		}
		cb.rewind();
		for (int i = 0; i < size; i++) {
			System.out.print(cb.get());
		}
	}
}
