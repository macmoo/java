package jp.wings.pocket.chap5;

import java.io.File;


public class FSGetInfoURI {
	public static void main(String[] args) {
		File file1 = new File("chap5/data/fsFile.txt");
		File file2 = new File("chap5/data");
		System.out.println("URI: " + file1.toURI());
		System.out.println("URI: " + file2.toURI());
	}
}
