package jp.wings.pocket.chap6;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

// クライアントから受信したパケットを、
// 文字列として出力するサーバプログラム。
// なお、このプログラムを実行する際には、
// SKUdpClientSample.javaを、
// 別のコマンドプロンプトから同時に起動させる。
public class SKUdpServerSample {
	public static void main(String[] args) {
		try {
			byte buf[] = new byte[1024];
			try (DatagramSocket ds = 
					new DatagramSocket(8888)) { // ソケットの生成
				DatagramPacket packet = 
						new DatagramPacket(buf, buf.length); // パケットの生成
				System.out.println("wait....");
				while (true) {
					ds.receive(packet);
					String str = new String(packet.getData(), 0, packet.getLength());
					System.out.println("received:" + str);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
