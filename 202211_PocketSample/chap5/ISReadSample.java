

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ISReadSample {
	public static void main(String[] args) throws IOException {

		URL sourceUrl = new URL("http://www.wings.msn.to/");
		try (InputStream in = sourceUrl.openStream()) {

			int d;
			while ((d = in.read()) != -1) {
				System.out.printf("%c", d);
			}
		}
	}
}
