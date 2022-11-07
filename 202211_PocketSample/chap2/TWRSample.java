package jp.wings.pocket.chap2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TWRSample {

	public static void main(String[] args) {

		// 従来の書き方
		InputStream fis1 = null;
		try {
			fis1 = new FileInputStream("file.txt");
			int content;
			// ファイルから1バイト読み込み表示する
			while ((content = fis1.read()) != -1) {
				System.out.print((char)content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis1 != null) {
				try {
					fis1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		// try-with-resources構文
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char)content);
			}
            // 明示的なクローズは不要
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
