

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class BArrayOutput {
	public static void main(String[] args) {
		byte[] bytes = new byte[] { 1, 2, 3 };
		try (ByteArrayInputStream is = new ByteArrayInputStream(bytes);
				ByteArrayOutputStream os = new ByteArrayOutputStream();) {

			int i = -1;
			while ((i = is.read()) > 0) {
				System.out.printf("%d ", i); // 結果:1 2 3
				// 符号を反転して書き込む
				os.write(-i);
			}
			// バイト配列として取り出す
			byte[] b = os.toByteArray();
			for (byte j : b) {
				System.out.printf("%#x ", j); // 結果:0xff 0xfe 0xfd
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
