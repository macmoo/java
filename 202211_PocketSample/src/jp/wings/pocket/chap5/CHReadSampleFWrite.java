package jp.wings.pocket.chap5;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CHReadSampleFWrite {
	public static void main(String[] args) {
		try {
			File f = new File("chap5/data/output.txt");
			try (FileWriter out = new FileWriter(f)) {
				// 文字列の書き込み
				out.write("sample");
			}
			try (FileReader in = new FileReader(f)) {
				// 先頭の1文字だけ読みこみ、文字コードを表示する
				System.out.println(in.read());
			}
		} catch (IOException e) {
		}
	}
}
