

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class NewIo2Sample {

	public static void main(String[] args) {
		// デフォルトのファイルシステムの取得
		FileSystem fileSystem = FileSystems.getDefault();
	
		// ルートディレクトの表示
		for (Path name : fileSystem.getRootDirectories()) {
			System.out.println(name);
		}
	}
}
