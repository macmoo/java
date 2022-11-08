package jp.wings.pocket.chap5;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class CHLineSampleNLine {
	public static void main(String[] args) throws IOException {

		long s = new Date().getTime();
		try (FileWriter out1 = 
				new FileWriter("chap5/data/output1.txt")) {
			// 現在日付を示す文字列を1000行書き込む
			for (int i = 0; i < 1000; i++) {
				out1.write(new Date().toString() + "\n");
			}
		}
		System.out.println(new Date().getTime() - s + "ミリ秒(FileWriterのみ)");

		s = new Date().getTime();
		try (BufferedWriter out2 = 
				new BufferedWriter(new FileWriter("chap5/data/output2.txt"))) {
			// 現在日付を示す文字列を1000行書き込む
			for (int i = 0; i < 1000; i++) {
				out2.write(new Date().toString());
				out2.newLine();
			}
		}
		System.out.println(new Date().getTime() - s + "ミリ秒(BufferedWriter)");
	}
}
