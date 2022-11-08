package jp.wings.pocket.chap6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLGetStreamInput {
	public static void main(String[] args)  {
		try {
			URL url = new URL("http://www.google.co.jp/");
			URLConnection con = url.openConnection();
		
			// ストリームのデータを表示
			try (BufferedReader in =
					new BufferedReader(
							new InputStreamReader(con.getInputStream()))){
				while (in.ready()) {
					System.out.println(in.readLine());
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}