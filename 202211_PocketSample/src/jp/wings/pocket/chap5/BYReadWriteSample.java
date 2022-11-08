package jp.wings.pocket.chap5;


import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

public class BYReadWriteSample {
	public static void main(String[] args) throws IOException {
		// 標準入力から入力する 
		try (FileInputStream in = new FileInputStream(FileDescriptor.in)) {
			 // 1文字読み取り、文字コードを表示する 
			System.out.printf("%X", in.read());
		}
	}
}
