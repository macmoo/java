package jp.wings.pocket.chap6;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class NewIo2AsyncServer {
	// 受信ハンドラ
	class ReadHandler
					implements CompletionHandler<Integer, ByteBuffer> {
		@Override
		public void completed(Integer result, ByteBuffer attachment) {
			System.out.println("受信バイト数:" + result);
			// 受信データを文字列に変換して表示する
			System.out.println(new String(attachment.array()));
		}

		@Override
		public void failed(Throwable exc, ByteBuffer attachment) {
		}
	}

	void acceptor(AsynchronousServerSocketChannel server) throws IOException {
		server.bind(new InetSocketAddress(5000));
		// acceptのハンドラを無名クラスで実装する
		server.accept(null, new CompletionHandler<AsynchronousSocketChannel, Void>() {
			@Override
			public void completed(AsynchronousSocketChannel channel, Void attachment) {
				ByteBuffer buff = ByteBuffer.allocate(1024);
				// ハンドラ内でバッファを利用するため第2引数でバッファを指定する
				channel.read(buff, buff, new ReadHandler());
				// 再度クライアントから接続できるようにacceptする
				server.accept(null, this);
			}

			@Override
			public void failed(Throwable exc, Void attachment) {
			}
		});
	}

	public static void main(String[] args) {
		// ノンブロッキングのサーバチャネルをオープンする
		try (AsynchronousServerSocketChannel server = AsynchronousServerSocketChannel.open()) {
			new NewIo2AsyncServer().acceptor(server);
			// ノンブロッキングのため終了しないようにする
			while (true) {
				Thread.sleep(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
