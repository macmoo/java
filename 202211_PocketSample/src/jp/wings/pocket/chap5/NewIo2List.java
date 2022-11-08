package jp.wings.pocket.chap5;


import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class NewIo2List {

	public static void main(String[] args) {

		Path p1 = FileSystems.getDefault().getPath("C:/Windows");
		// C:\Windows直下のファイル一覧を取得
		try (Stream<Path> stream = Files.list(p1)) {
			// 拡張子".sys"のみ抽出して表示する
			stream.filter(v -> v.getFileName().toString().endsWith(".sys")).
			forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
