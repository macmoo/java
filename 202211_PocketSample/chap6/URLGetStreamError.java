package jp.wings.pocket.chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class URLGetStreamError {
	// ストリームのデータを表示
	static void view(InputStream is) throws IOException {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(is))) {
			while (in.ready()) {
				System.out.println(in.readLine());
			}
		}
	}
	public static void main(String[] args) {
		URLConnection con = null;
		try {
			URL url = new URL("http://www.google.co.jp/xx");
			con = url.openConnection();
			// コンテンツ表示 
			view(con.getInputStream());
		}
		catch (IOException e) {
			 // エラー（404エラーなど）発生 
			try {
				HttpURLConnection hcon = (HttpURLConnection) con;
				int rescode = hcon.getResponseCode();
				System.out.println(rescode + " " + hcon.getResponseMessage());
				view(hcon.getErrorStream());
			}
			catch (IOException e2) {
				// エラー情報なし
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}