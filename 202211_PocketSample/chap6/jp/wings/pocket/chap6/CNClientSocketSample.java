package jp.wings.pocket.chap6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

// サーバに文字列を送信し、受け取った文字列を取得する。
// なお、このプログラムを実行する際には、CNServerSocketSample.java
//（項目「サーバソケットチャネルを操作する」を参照）を、
// 別のコマンドプロンプトから同時に起動すること。
public class CNClientSocketSample {
	public static void main(String[] args) {
		try {
			// クライアントのソケットのチャネルをopenする
			try (SocketChannel sc = SocketChannel.open()) {
				sc.connect(new InetSocketAddress("localhost", 1234));
				System.out.print("Input : ");

				// 標準入力の内容をチャネルに書き込む
				// 標準入力
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				CharBuffer cb = CharBuffer.wrap(br.readLine());
				sc.write(Charset.forName("ISO-8859-1").newEncoder().encode(cb));

				// チャネルから読み込む
				ByteBuffer bb = ByteBuffer.allocateDirect(1024);
				sc.read(bb);
				bb.flip(); // バッファの反転
				System.out.print("Received : ");
				System.out.println(Charset.forName("ISO-8859-1").newDecoder().decode(bb).toString());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
