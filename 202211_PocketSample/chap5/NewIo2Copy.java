

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class NewIo2Copy {

	public static void main(String[] args) {

		try {
			Path p1 = FileSystems.getDefault().getPath("C:/aa/test1.txt");
			Path p2 = FileSystems.getDefault().getPath("C:/bb/test2.txt");

			// コピー
			Files.copy(p1, p2);

			// 上書きの移動
			Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// FileInputStreamを使ったコピー
		try (InputStream in = new FileInputStream("C:/aa/test1.txt")) {
		
			Files.copy(in, FileSystems.getDefault().getPath("C:/bb/test2.txt"), 
					StandardCopyOption.REPLACE_EXISTING);

		} catch (IOException e) {
			e.printStackTrace();
		}
		// FileOutputStreamを使ったコピー
		try (OutputStream out = new FileOutputStream("C:/bb/test2.txt")) {

			// 常に上書きコピーになる
			Files.copy(FileSystems.getDefault().getPath("C:/aa/test1.txt"), out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
