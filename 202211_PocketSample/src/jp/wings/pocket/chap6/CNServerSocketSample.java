package jp.wings.pocket.chap6;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

// クライアントから受け取った文字列の先頭に(S)と付け足して返す。
// なお、このプログラムを実行する際には、CNClientSocketSample.java
//（項目「ソケットのチャネルを操作する」を参照）を、
// 別のコマンドプロンプトから同時に起動すること。
public class CNServerSocketSample {
	public static void main(String[] args) {
		try (ServerSocketChannel ssc = ServerSocketChannel.open()) {
			ssc.socket().bind(new InetSocketAddress(1234));
			try (SocketChannel sc = ssc.accept()) { // 待機
				System.out.println("wait....");

				// 読み込みを行うバッファ
				ByteBuffer bf = ByteBuffer.allocateDirect(1024);
				bf.putChar('(');
				bf.putChar('S');
				bf.putChar(')');

				sc.read(bf); // 読み込み
				bf.flip(); // バッファの反転
				sc.write(bf); // 書き込み
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
