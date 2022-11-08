package jp.wings.pocket.chap6;

import java.net.URL;

public class GetDefaultPortSample {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.google.co.jp/search?hl=ja&source=hp&q=java");
			System.out.printf("Port:%d%n", url.getDefaultPort());
			System.out.printf("Host:%s%n", url.getHost());
			System.out.printf("Path:%s%n", url.getPath());
			System.out.printf("Port:%d%n", url.getPort());
			System.out.printf("Protocol:%s%n", url.getProtocol());
			System.out.printf("Query:%s%n", url.getQuery());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
