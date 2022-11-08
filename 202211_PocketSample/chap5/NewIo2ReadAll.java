

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class NewIo2ReadAll {

	public static void main(String[] args) {

		List<String> lists = Arrays.asList("あああ", "いいい");
		Path p1 = FileSystems.getDefault().getPath("C:/aa/test.txt");
		try {
			Files.write(p1, lists);

			// 文字列のリストに一度に読み込み（UTF-8）
			List<String> list = Files.readAllLines(p1);
			System.out.println(list); // 結果：[あああ, いいい]

			// バイト配列に一度に読み込み、サイズを表示
			System.out.println(Files.readAllBytes(p1).length); // 結果：22

		} catch (IOException e) {
		}
	}
}
