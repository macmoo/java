package jp.wings.pocket.chap5;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewIo2CreateTemp {

	public static void main(String[] args)  {

		try {
			// 一時ファイルを作成する
			Path p1 = Files.createTempFile("tmp",null);
			// 一時ディレクトリを作成する
			Path p2 = Files.createTempDirectory(FileSystems.getDefault().getPath("C:/aa"),"tmp");

			// ファイル名の表示（結果は環境によって異なる）
			System.out.println(p1); 
			System.out.println(p2); 

		} catch (IOException e) {
		}

	}
}
