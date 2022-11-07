package jp.wings.pocket.chap5;

import java.io.File;
import java.io.IOException;


public class FSGetInfoName {
	public static void main(String[] args) throws IOException {
		File file = new File("chap5/data/fsFile.txt");
		System.out.println("ファイル名:" + file.getName());
		System.out.println("親ディレクトリ名:" + file.getParent());
		System.out.println("親ディレクトリ名:" + file.getParentFile());
		System.out.println("パス名:" + file.getPath());
		System.out.println("絶対パス:" + file.getAbsolutePath());
		System.out.println("正規パス:" + file.getCanonicalPath());
		System.out.println("絶対パス:" + file.getAbsoluteFile());
		System.out.println("正規パス:" + file.getCanonicalFile());
	}
}
