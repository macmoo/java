package jp.wings.pocket.chap6;

import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;


public class URLTimeOutSample {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://192.168.0.20/");
			URLConnection con = url.openConnection();
			con.setConnectTimeout(1000); // タイムアウト1秒
			con.setReadTimeout(1000*10); // タイムアウト10秒
			try {
				con.connect();
				System.out.printf("content:%s",	con.getContent().toString());
			}
			catch (SocketTimeoutException e) {
				System.out.println("タイムアウト発生: "+e.getMessage());
				System.out.println("ConnectTimeout: "+con.getConnectTimeout());
				System.out.println("ReadTimeout: "+con.getReadTimeout());
			}
		}
		catch (Exception e) {
			System.out.println("通信エラー発生: " +e.getMessage());
		}
	}
}
