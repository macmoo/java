package jp.wings.pocket.chap6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//クライアントから"exit"と送られてくるまで、送られてきたデータを
//加工して返します。なお、このサンプルを起動した後、
//別のコマンドプロンプトからSKTcpClientSample.java
//（項目「クライアント側のTCP/IPソケットを操作する」を参照）を
//起動してください。
public class SKTcpServerSample {
	public static void main(String[] args) {
		System.out.println("wait....");
		try (ServerSocket ss = new ServerSocket();) {
			ss.bind(new InetSocketAddress("localhost", 1234));
			// 待機
			try (Socket cs = ss.accept();
				// 入力ストリーム
				BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
				// 出力ストリーム
				PrintWriter out = new PrintWriter(cs.getOutputStream(), true);) {

				// 送られたデータの先頭に"(S)"とつけて返す
				// "exit"と送られてきたら終了
				String str;
				while (true) {
					str = in.readLine();
					if (str.equals("exit")) {
						break;
					}
					out.println("(S)" + str);
					System.out.println("received:" + str);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
