package jp.wings.pocket.chap5;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class POStreamSample {
	public static void main(String[] args) {
		try (
			// パイプの準備
			PipedInputStream piStream = new PipedInputStream();
			PipedOutputStream poStream = new PipedOutputStream(piStream);){

			// バイト配列の書き込み
			poStream.write("12345".getBytes());

			// 読込可能なサイズだけ読込み
			byte[] rcv = new byte[piStream.available()];
			piStream.read(rcv);

			// 読み込んだデータの表示
			for ( byte tmp: rcv )
				System.out.printf("%X ",tmp);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
