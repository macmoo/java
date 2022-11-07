package jp.wings.pocket.chap5;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewIo2Delete {

	public static void main(String[] args) {

		// Pathを作成する
		Path dir1 = FileSystems.getDefault().getPath("C:/aa/bb");
		try {
			// ディレクトリ作成
			Files.createDirectories(dir1);
			// ディレクトリ削除
			Files.delete(dir1);
			// ディレクトリ削除、存在しないのでfalseを返す
			System.out.println(Files.deleteIfExists(dir1)); // 結果：fasle
		} catch (IOException e) {
		}
	}
}
