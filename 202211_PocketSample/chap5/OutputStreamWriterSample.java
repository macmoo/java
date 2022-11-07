package jp.wings.pocket.chap5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class OutputStreamWriterSample {
	public static void main(String[] args) {
		try {
			File f = new File("chap5/data/isfile2.txt");
			// シフトJISの文字セット
			Charset cs = Charset.forName("SJIS");

			try (OutputStreamWriter out = 
					new OutputStreamWriter(new FileOutputStream(f), cs.newEncoder());) {
				out.write("東京・大阪");
			}
			File f2 = new File("chap5/data/isfile3.txt");
			// シフトJISコードで読み取る
			try (InputStreamReader in = 
					new InputStreamReader(new FileInputStream(f), cs.newDecoder())) {
				// UTF-8コードで書き込む
				try (OutputStreamWriter out2 = 
						new OutputStreamWriter(new FileOutputStream(f2), "UTF8")) {
					while (in.ready())
						out2.write(in.read());
				}
			}
			// UTF-8コードで読み取り、文字コードを表示する
			try (InputStreamReader in2 = 
					new InputStreamReader(new FileInputStream(f2), "UTF8")) {
				while (in2.ready())
					System.out.printf("%X ", in2.read());
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}

}
