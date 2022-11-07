package jp.wings.pocket.chap5;

import java.io.File;
import java.io.FileFilter;

public class FSListAcceptFile {
	public static void main(String[] args) {
		File dir = new File("chap5/data/");

		// ディレクトリだけをリストアップする
		File[] filtList = dir.listFiles(new FileFilter() {
			public boolean accept(File file) {
				 return file.isDirectory();
			}
		});
		for (File tmp : filtList) {
			System.out.println("Dirリスト：" + tmp.getName());
		}
	}
}
