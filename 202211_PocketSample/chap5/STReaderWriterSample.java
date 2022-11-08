

import java.io.IOException;
import java.io.StringReader;

public class STReaderWriterSample {
	public static void main(String[] args) {
		// StringReaderの生成
		try (StringReader sr = new StringReader("sample")) {
			char[] data = new char[1];
			// 1文字づつ読み込む
			while (sr.read(data) != -1) {
				System.out.println(data);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
