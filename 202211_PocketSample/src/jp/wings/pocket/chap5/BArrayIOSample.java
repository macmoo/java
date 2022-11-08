package jp.wings.pocket.chap5;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BArrayIOSample {
	public static void main(String[] args) {
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		try (ByteArrayInputStream in = 
			 new ByteArrayInputStream(tmp.getBytes())) {

			for (int i = 0; i < 2; i++) {
				for (int c = 0; (c = in.read()) != -1;) {
					// 2回目の表示は大文字にする
					System.out.printf("%c", (i == 0) ? c : Character.toUpperCase(c));
				}
				System.out.println();
				in.reset(); // 読み込み元を先頭にもどす
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
