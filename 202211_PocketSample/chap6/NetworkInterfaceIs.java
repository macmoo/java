package jp.wings.pocket.chap6;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfaceIs {

	public static void main(String[] args) {

		try {
			Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

			while(interfaces.hasMoreElements()) {
				NetworkInterface v = interfaces.nextElement();

				// 表示名
				System.out.println(v.getDisplayName());
				// 接続状態
				System.out.println("起動: "	+ v.isUp());
				// ループバック
				System.out.println("ループバック: " + v.isLoopback());
				// Point to Point
				System.out.println("PPP: "	+ v.isPointToPoint());
				// マルチキャストのサポート
				System.out.println("マルチキャスト: " + v.supportsMulticast());
			}
		}
		catch (SocketException ex) {
			ex.printStackTrace();
		}
	}

}
