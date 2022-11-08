package jp.wings.pocket.chap5;


import java.io.File;
import java.util.Date;

public class FSGetInfoRead {
	public static void main(String[] args) {
		File file = new File("chap5/data/fsfile1.txt");
		System.out.println("読み込み可能か:" + file.canRead());
		System.out.println("書き込み可能か:" + file.canWrite());
		System.out.println("実行可能か:" + file.canExecute());
		System.out.println("絶対パス名か:" + file.isAbsolute());
		System.out.println("ディレクトリか:" + file.isDirectory());
		System.out.println("ファイルか:" + file.isFile());
		System.out.println("隠しファイルか:" + file.isHidden());
		System.out.println("最終更新日:" + new Date(file.lastModified()).toString());
		System.out.println("長さ:" + file.length());
		System.out.println("存在:" + file.exists());
	}
}
