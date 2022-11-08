

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class InputStreamRWSample {
	public static void main(String[] args) {
		File f = new File("chap5/data/isfile1.txt");
		try {
			try (FileWriter out = new FileWriter(f);) {
				out.write("あいうえお");
			}
			try (InputStreamReader in = 
					new InputStreamReader(
						new FileInputStream(f), Charset.defaultCharset())) {
				System.out.println(in.getEncoding());
				while (in.ready())
					System.out.printf("%c", in.read());
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}

}
