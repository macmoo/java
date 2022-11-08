package jp.wings.pocket.chap6;

import java.net.URL;
import java.net.URLConnection;

// http://www.wings.msn.to/にアクセスし、コンテンツタイプを取得
public class URLConnectType {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.wings.msn.to/");
			URLConnection con = url.openConnection();
			con.connect();
			System.out.println(con.getContentType());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
