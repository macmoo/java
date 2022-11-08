

import java.io.File;

import java.util.Date;

public class FSGetInfoRename {
	public static void main(String[] args) {
		File org = new File("chap5/data/fsfile2.txt");
		System.out.println("名前変更:"
				+ org.renameTo(new File("chap5/data/new_fsFile.txt")));

		File file = new File("chap5/data/fsfile1.txt");
		long tenMinBef = new Date().getTime() - 10 * 60 * 1000;
		System.out.println("更新時刻変更:" + file.setLastModified(tenMinBef));
		System.out.println("最終更新日:" + new Date(file.lastModified()).toString());
		System.out.println("読み取り専用に変更:" + file.setReadOnly());
	}
}
