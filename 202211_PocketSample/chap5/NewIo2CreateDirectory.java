package jp.wings.pocket.chap5;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewIo2CreateDirectory {

	public static void main(String[] args) {

		// Pathを作成する
		Path dir1 = FileSystems.getDefault().getPath("C:/aa/bb");
		try {
			// ディレクトリ作成
			Files.createDirectory(dir1);
		} catch (IOException e) {
			// C:/aaがないと失敗する
			System.out.println("作成失敗");
		}
		try {
			// C:/aaがなくても作成できる
			Files.createDirectories(dir1);
			// dir1が存在するので例外がスローされる
			Files.createDirectory(dir1);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
