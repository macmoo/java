package jp.wings.pocket.chap5;

import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.IOException;

public class CHReadSample {
	public static void main(String[] args) {
		try (
			// 標準入力の入力ストリーム
			FileReader in = new FileReader(FileDescriptor.in);) {

			// 1文字読込み、表示する
			int d = in.read();
			System.out.printf("%c", d);
		}
		catch (IOException e) {
		}
	}
}
