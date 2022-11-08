package jp.wings.pocket.chap6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// 標準入力に入力したデータをサーバに送り、サーバから送信された
// データを出力します。コマンドプロンプトでexitと入力すれば終了します。
// なお、このサンプルを実行する際には、SKTcpServerSample.java
// 項目「サーバ側のTCP/IPソケットを操作する」を参照）を、別のコマンド
// プロンプトから同時に起動させてください。
public class SKTcpClientSample {
	public static void main(String[] args) {
		try {
			try (Socket cs = new Socket("localhost", 1234);
				 // 出力ストリーム
				 PrintWriter out = new PrintWriter(cs.getOutputStream(), true);
				 // 入力ストリームinの生成
				 BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
				 // 標準入力
				 BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));) {

				// サーバにデータを送り、受信したデータをプリントする
				String input, str;
				while (true) {
					System.out.print("Input:");
					input = sin.readLine();
					out.println(input); // 標準入力のデータをサーバに送る
					if (input.equals("exit")) {
						break; // 終了
					}
					str = in.readLine();
					System.out.println("received:" + str);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}