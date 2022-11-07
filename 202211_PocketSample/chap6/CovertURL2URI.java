package jp.wings.pocket.chap6;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class CovertURL2URI {
	public static void main(String[] args)  {

		try {
		    URI uri = new URI("file://C:/Windows");
			// URLに変換
			URL url = uri.toURL();
			// URIに変換し、元のURIと比較
		    System.out.println(uri.equals(url.toURI()));
		}
		catch (URISyntaxException e) {
			e.printStackTrace();
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
