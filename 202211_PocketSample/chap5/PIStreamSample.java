

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PIStreamSample {
	public static void main(String[] args) {
		try (// パイプの準備
			PipedOutputStream poStream = new PipedOutputStream();
			PipedInputStream piStream = new PipedInputStream()) {

			// 入力ストリームを出力ストリームに接続
			piStream.connect(poStream);

			// バイト配列の一部を書き込み
			poStream.write(new byte[] { 1, 2, 3, 4, 5 }, 2, 3);

			// 読込可能なサイズだけ読込み
			byte[] rcv = new byte[piStream.available()];
			piStream.read(rcv);

			// 読み込んだデータの表示
			for (byte tmp : rcv)
				System.out.printf("%d ", tmp);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
