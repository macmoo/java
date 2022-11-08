

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewIo2CreateFile {

	public static void main(String[] args) {

		// Pathを作成する
		Path path1 = FileSystems.getDefault().getPath("C:/aa/bb.txt");
		try {
			Files.createFile(path1);
		} catch (IOException e) {
			System.out.println("作成失敗");
		}
	}
}
