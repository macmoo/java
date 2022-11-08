

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CHReadWriteSample {
	public static void main(String[] args) {
		try {
			File f = new File("chap5/data/output.txt");

			try (FileWriter out = new FileWriter(f);) {
				out.write("サンプル"); // 文字列の書き込み
			}

			// バッファ配列を用意
			char[] d = new char[50];
			try (FileReader in = new FileReader(f)) {
				int r = in.read(d);		 // 配列に読み込む
				System.out.println(d);	 // 結果：サンプル

				try (FileWriter out = new FileWriter(f, true);) {
					// 読み込んだ文字データを追記する
					out.write(d, 0, r);
				}
			}

			try (FileReader in = new FileReader(f);) {
				in.read(d);
				System.out.println(d);	// 結果：サンプルサンプル
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
