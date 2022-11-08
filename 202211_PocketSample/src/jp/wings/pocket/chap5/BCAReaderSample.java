package jp.wings.pocket.chap5;


import java.io.CharArrayReader;
import java.io.IOException;

public class BCAReaderSample {
	public static void main(String[] args) {
		char[] chars = { 'あ', 'い', 'う', 'え', 'お' };
		try (CharArrayReader reader = 
			new CharArrayReader(chars, 1, 3)) {

			while (reader.ready()) {
				System.out.printf("%c", reader.read());
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
