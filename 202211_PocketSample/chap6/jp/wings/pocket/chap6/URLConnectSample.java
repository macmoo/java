package jp.wings.pocket.chap6;

import java.net.URL;
import java.net.URLConnection;

// http://www.wings.msn.to/にアクセスし、コンテンツタイプを取得
public class URLConnectSample {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.google.com/");
			URLConnection con = url.openConnection();
			System.out.println(con.getURL());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
