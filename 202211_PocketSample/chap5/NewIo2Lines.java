

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NewIo2Lines {

	public static void main(String[] args) {

		Path p1 = FileSystems.getDefault().getPath("C:/aa/test.txt");
		List<String> lists = Arrays.asList("ああ", "いい", "うう");
		try {
			// テキストファイルの作成（文字エンコード指定）
			Files.write(p1, lists, Charset.forName("MS932"));
			// 文字列のリストに一度に読み込み（文字エンコード指定）
			try (Stream<String> stream = Files.lines(p1,
					Charset.forName("MS932"))) {
				// 全行を表示
				stream.forEach(System.out::print); //　結果：ああいいうう
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
