package jp.wings.pocket.chap5;

import java.io.File;
import java.io.FilenameFilter;

public class FSListSampleAccept {
	public static void main(String[] args) {
		File dir = new File("chap5/data/");

		// 拡張子が.gifのものだけをリストアップする
		File[] filtList = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(".gif");
			}
		});
		for (File tmp : filtList) {
			System.out.println("GIFファイルリスト：" + tmp.getName());
		}
	}
}
