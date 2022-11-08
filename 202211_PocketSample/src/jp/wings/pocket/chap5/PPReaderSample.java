package jp.wings.pocket.chap5;


import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PPReaderSample {
	public static void main(String[] args) {
		try (
			// パイプの準備
			PipedReader reader = new PipedReader();
			PipedWriter writer = new PipedWriter();){

			// 入力ストリームを出力ストリームに接続
			reader.connect(writer);

			writer.write("サンプル");

			while (reader.ready())
				System.out.printf("%c",reader.read());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
