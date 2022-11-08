

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewIo2Write {

	public static void main(String[] args) {
		// 文字列をバイト配列にする
		byte[] bytes1 = "12345".getBytes();
		try {
			// 一時ファイルの作成
			Path p1 = Files.createTempFile("tmp", null);
			// バイト配列の書き込み
			Files.write(p1, bytes1);

			// バイト配列に一度に読み込み、
			// 16進数の文字列として表示する
			byte[] bytes2 = Files.readAllBytes(p1);
			for (byte b : bytes2) 
				System.out.printf("%X ", b);
			// ファイルの削除
			Files.delete(p1);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
