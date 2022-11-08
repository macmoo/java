package jp.wings.pocket.chap5;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CHReadSampleRead {
	public static void main(String[] args) {
		try {
			File f = new File("chap5/data/output.txt");
			try (FileWriter out = new FileWriter(f)) {
				out.write("sam");
			}
			// 配列に読込み
			try (FileReader in = new FileReader(f)) {
				char[] d = new char[10];
				int r = in.read(d);
				System.out.println(d);

				// 追記で出力ストリームを生成
				try (FileWriter out = new FileWriter(f, true)) {
					out.write("ple");
				}

				// オフセット、サイズを指定して読み込む
				in.read(d, r, 3);
				System.out.println(d);
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
