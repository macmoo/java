package jp.wings.pocket.chap6;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//指定したURLに接続し、ヘッダやボディの情報を取得します。
public class URLGetInfoSample {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.wings.msn.to/");
			URLConnection con = url.openConnection();
			Map<String,String> f1 =
				new LinkedHashMap<String,String>();
			f1.put("URL", con.getURL().toString());
			f1.put("Content-Length",
					Integer.toString(con.getContentLength()));
			f1.put("Content-Type",con.getContentType());
			f1.put("Content-Encoding", con.getContentEncoding());
			f1.put("Expiration", Long.toString(con.getExpiration()));
			f1.put("Date", new Date(con.getDate()).toString());
			f1.put("LastModified",
					new Date(con.getLastModified()).toString());
			f1.put("key1_field",
					con.getHeaderField(con.getHeaderFieldKey(1)));
			for(String k : f1.keySet()) {
				System.out.printf("%s: %s%n", k, f1.get(k));
			}

			Map<String,List<String>> f2 = con.getHeaderFields();
			for(String k : f2.keySet()) {
				System.out.printf("%nkey:%s field:%s", k, f2.get(k));
			}
			System.out.printf("%n%ncontent:%s",
					con.getContent().toString());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
