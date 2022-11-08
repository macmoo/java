

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamSample {
	public static void main(String[] args) throws IOException {
		// 標準エラー出力の指定
		try (FileOutputStream out = 
				new FileOutputStream(FileDescriptor.err)) {
			// errを出力する
			out.write(new byte[] { 'e', 'r', 'r' });
		}
	}
}
