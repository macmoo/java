package jp.wings.pocket.chap5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// byInStr.txtの内容を一文字飛ばしで読み、byOutStr.txtに書き出します
public class BYStreamOpeSample {
	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("chap5/data/byInStr.txt");
 			 OutputStream os = new FileOutputStream("chap5/data/byOutStr.txt");) {
			int val = -1;
			while (0 <= (val = is.read())) {
				os.write(val);
				if (1 < is.available()) {
					is.skip(1); // まだ読み込めるものがある場合には一文字スキップ
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
