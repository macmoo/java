package jp.wings.pocket.chap6;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;

public class NetworkInterfaceNmae {
	public static void main(String[] args) {

		try {
			Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

			while(interfaces.hasMoreElements()) {
				NetworkInterface v = interfaces.nextElement();
				// 表示名
				System.out.println("Display Name: "	+ v.getDisplayName());

				// 名前
				System.out.println("  Name: "	+ v.getName());

				// アドレス
				List<InterfaceAddress> addresses  = v.getInterfaceAddresses();
				for (InterfaceAddress address: addresses) {
					// アドレス
					System.out.println("  Address: "+ address.getAddress());
					// ブロードキャストアドレス
					System.out.println("  Broadcast: "+ address.getBroadcast());
				}
	
				// 物理アドレス
				byte hwAddress[] = v.getHardwareAddress();
				if (hwAddress != null) {
					System.out.print("  MAC アドレス: ");
					for (byte segment: hwAddress) {
						System.out.printf("%02x ", segment);
					}
					System.out.println();
				}

				// MTU
				System.out.println("  MTU: " + v.getMTU());
				System.out.println();
			}
		}
		catch (SocketException ex) {
			ex.printStackTrace();
		}
	}

}
