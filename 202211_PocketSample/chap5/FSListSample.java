package jp.wings.pocket.chap5;

import java.io.File;


public class FSListSample {
	public static void main(String[] args) {
		File dir = new File("chap5/data/");
		String[] list = dir.list(); //ファイルリストの取得
		for (String tmp : list) {
			System.out.println("ファイルリスト：" + tmp);
		}
		for (File tmp : File.listRoots()) {
			System.out.println("ルートリスト：" + tmp.getAbsolutePath());
		}
	}
}
