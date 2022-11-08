package jp.wings.pocket.chap6;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class CovertURI2URL {
	public static void main(String[] args)  {
		try {
		    URI uri = new URI("file://C:/Windows");

		    // URLに変換
			URL url = uri.toURL();
		    System.out.println(url);
		}
		catch (URISyntaxException e) {
			e.printStackTrace();
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
