package jp.wings.pocket.chap5;

import java.io.File;
import java.io.IOException;

public class FSCreareSample {
	public static void main(String[] args) {
		try {
			File file = new File("chap5/data/subDir2/newFile.txt");
			System.out.println(file.createNewFile()); // 結果：true

			File tmp = File.createTempFile("TMP_", null);
			System.out.println( tmp.getCanonicalPath());
			 // 結果： C:\Users\wings\AppData\Local\Temp\TMP_6823706731161643231.tmp
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
