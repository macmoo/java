package jp.wings.pocket.chap5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class CHLineSample {
	public static void main(String[] args) throws IOException {

		File f = new File("chap5/data/output.txt");
		try (FileWriter out = new FileWriter(f)) {
			// 現在日付を示す文字列を1000行書き込む
			for (int i = 0; i < 1000; i++) {
				out.write(new Date().toString() + "\n");
			}
		}
		try (BufferedReader in = new BufferedReader(new FileReader(f))) {
			int line = 0;
			while (in.readLine() != null) {
				line++; // 行数をカウントする
			}
			System.out.println("行数: " + line);
		}
	}
}
