package jp.wings.pocket.chap5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Calendar;

public class LINumberSample {
	public static void main(String[] args) throws IOException {

		File f = new File("chap5/data/output.txt");
		try (BufferedWriter out = new BufferedWriter(new FileWriter(f))) {
			// 現在から3日後までの日付文字列を書き込む
			for (int i = 0; i < 4; i++) {
				Calendar now = Calendar.getInstance();
				now.add(Calendar.DATE, i);
				out.write(now.getTime().toString());
				out.newLine();
			}
		}

		// output.txtの内容を読み込み、行番号をつけて出力
		try (LineNumberReader line = new LineNumberReader(new FileReader(f))) {
			while (line.ready()) { // 読み込める限り読み込む
				System.out.println(line.getLineNumber() + " : " + line.readLine());
			}
		}
	}
}
