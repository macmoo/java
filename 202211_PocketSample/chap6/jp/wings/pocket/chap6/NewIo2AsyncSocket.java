package jp.wings.pocket.chap6;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;

public class NewIo2AsyncSocket {

	public static void main(String[] args) {
		// ノンブロッキングのソケットチャネルをオープンする
		try (AsynchronousSocketChannel client = AsynchronousSocketChannel.open()) {
			// ローカルのサーバに接続を試みる
			client.connect(new InetSocketAddress("localhost", 5000)).get();

			String message = "abcdefghijk";
			// 文字列をバイト配列に変換しバッファを生成する
			ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());

			// バッファのデータを送信
			int result = client.write(buffer).get();
			System.out.println("送信バイト数:" + result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
