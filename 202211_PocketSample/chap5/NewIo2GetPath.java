package jp.wings.pocket.chap5;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewIo2GetPath {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();

		// FileSystemから生成
		Path path1 = fs.getPath("C:/aa/bb.txt");
		Path path2 = fs.getPath("C:/aa/", "bb.txt");
		Path path3 = fs.getPath("C:", "aa", "bb.txt");

		// ディレクトリの場合
		Path dir = fs.getPath("C:/aa");

		// Pathsクラスから生成
		Path path4 = Paths.get("C:/aa/bb.txt");

		// いずれも同じファイルを表す
		System.out.println(path1);
		System.out.println(path2);
		System.out.println(path3);
		System.out.println(path4);	
	}
}
