package jp.wings.pocket.chap5;

import java.io.File;


public class FSMkdirSample {
	public static void main(String[] args) {
		File dir1 = new File("chap5/data/subDir1");
		File dir2 = new File("chap5/data/subDir2/tmp/tmp");

		System.out.println(dir1 + "生成: " + dir1.mkdir());
		System.out.println(dir2 + "生成: " + dir2.mkdirs());
		System.out.println( "存在?: "+dir2.exists() );
	}
}
