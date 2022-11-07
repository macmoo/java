package jp.wings.pocket.chap5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class LINumberSampleSet {
	public static void main(String[] args) throws IOException {

		File f = new File("chap5/data/output.txt");
		try (BufferedWriter out = new BufferedWriter(new FileWriter(f))) {
			// 1000からの数字を5行書き込む
			for (int i = 0; i < 5; i++) {
				out.write(String.valueOf(i + 1000));
				out.newLine();
			}
		}

		// output.txtの内容を読み込み、行番号をつけて出力
		try (LineNumberReader line = new LineNumberReader(new FileReader(f))) {
			line.setLineNumber(1000);
			while (line.ready()) { // 読み込める限り読み込む
				System.out.println(line.getLineNumber() + " : " + line.readLine());
			}
		}
	}
}
