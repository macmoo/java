package jp.wings.pocket.chap6;

import java.io.InputStreamReader;
import java.net.URL;

public class URLGetStreamSample {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.google.co.jp/");

			// 入力ストリーム取得
			try (InputStreamReader in =
						new InputStreamReader(url.openStream())){

				// データ読み取り後表示
				for (int c; (c = in.read()) != -1;) {
					System.out.printf("%c",c);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}