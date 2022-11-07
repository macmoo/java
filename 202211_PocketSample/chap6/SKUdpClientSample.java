package jp.wings.pocket.chap6;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// UDPを用いたパケット送信クライアントプログラム
public class SKUdpClientSample {
	public static void main(String[] args) {
		try {
			String str = "Hello World!";
			// ソケットの生成
			try (DatagramSocket ds = new DatagramSocket()) {

				byte[] data = str.getBytes();
				// パケットの生成
				DatagramPacket dp = 
					new DatagramPacket(data, data.length, 
						InetAddress.getByName("localhost"), 8888);
				ds.send(dp);
				System.out.println("send:" + str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
